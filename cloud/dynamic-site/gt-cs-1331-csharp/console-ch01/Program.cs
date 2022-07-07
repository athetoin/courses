using _4MeOnWeb.SolutionAPI;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;
using System.Reflection;

namespace _4MeOnWeb.ConsoleCh01 {
  internal static class Program {
    static IHostBuilder CreateHostBuilder(string[] args) =>
      Host.CreateDefaultBuilder(args)
        .ConfigureServices((_, services) => {
          IEnumerable<Type> solutions = Assembly.Load("solutions").GetTypes()
            .Where(x => !x.IsAbstract && x.IsClass && x.GetInterface(nameof(ISolution)) == typeof(ISolution));
          foreach (Type solution in solutions) {
            services.Add(new ServiceDescriptor(typeof(ISolution), solution, ServiceLifetime.Singleton));
          }
          services.AddSingleton<SolutionList>();
          services.Configure<ConsoleLifetimeOptions>(options =>
            options.SuppressStatusMessages = true);
        });

    static private SolutionList? slts;
    static private ISolution? selSltn;

    static void Main(string[] args) {
      IHost? host = CreateHostBuilder(args).Build();
      _ = host.RunAsync();

      slts = host.Services.CreateScope().ServiceProvider.GetRequiredService<SolutionList>();

      Console.WriteLine("-----------------------------");
      Console.WriteLine("GT CS 1331 Chapter 1 (C#)");
      Console.WriteLine("-----------------------------");
      if ((selSltn = ListSolutions(slts)) != null) {
        Answer();
      }
      RunUILoop();
    }

    private static void Answer() {
      Console.WriteLine("\n-----------------------------");
      Console.WriteLine(selSltn!.Label);
      Console.WriteLine("-----------------------------");
      foreach (string line in selSltn.Answers) {
        Console.WriteLine(line);
      }
    }

    static ISolution? ListSolutions(SolutionList slts) {
      Console.WriteLine("Solutions");
      foreach (string label in slts.List.Select(item => item.Label)) {
        Console.WriteLine($"\t{label}");
      }
      Console.WriteLine("-----------------------------");
      Console.Write("Choose a solution: ");
      string? sltn_id = Console.ReadLine();
      return slts.GetSolution(sltn_id);
    }

    static void RunUILoop() {
      Console.Write("\n(R)erun, (S)elect solution, (Q)uit: ");
      var sel = Console.ReadLine();
      switch (sel) {
        case "Q":
        case "q":
          return;
        case "S":
        case "s":
          if ((selSltn = ListSolutions(slts!)) != null) {
            Answer();
          }
          RunUILoop();
          break;
        case "R":
        case "r":
          if (selSltn != null) {
            Answer();
          }
          RunUILoop();
          break;
        default:
          RunUILoop();
          break;
      }
    }
  }
}

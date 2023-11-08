package ch02_java_syntax_from_the_ground_up;

/**
 * StringDemo
 */
public class StringDemo {

  public static void main(String[] args) {
    String story = "\t\"How can you stand it?\" he asked sarcastically.\n";

    System.out.println(story);
    System.out.println("-----");

    String html = """
        <html>
          <body class="main-body">
            ...
          </body>
        </html>""";

    String htmlWithWhiteSpace = """
            <html>
              <body class="main-body">
                ...
              </body>
            </html>
        """;

    System.out.println(html);
    System.out.println(htmlWithWhiteSpace);

  }
}
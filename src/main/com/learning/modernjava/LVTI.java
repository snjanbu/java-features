
String prefix = "Hello";
void main() {
    var name = "Sanjay";
    System.out.println("name = " + name);

    var employeeInfo = Map.of(1, List.of("A", "b"), 2, List.of("C", "d"));
    System.out.println("employeeInfo = " + employeeInfo);

    System.out.println(greet("Sanjay"));
}

String greet(String name) {
    return prefix + " " + name;
}

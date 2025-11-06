package com.pluralsight.LambdaMiniExercises;

/**
 * Exercises (contained in a single class) to learn and test knowledge regarding lambda functions.
 * Exercises #11-20 were made optional.
 *
 * @author Ravi Spigner
 */
public class LambdaMiniExercises {
    //Problem #11
    //Interface declaration
    interface Action { void run();}
    //perform method to call interface Action.run() method
    private void perform(Action action) {
        action.run();
    }

    public static void main(String[] args) {
        //1)Your first lambda
        System.out.println("Exercise #1");
        interface Hello { void sayHello(); }
        //Hello hello = () -> System.out.println("Hello World!");
        //Task: Change it to print "Hi from Java!"
        Hello hello = () -> System.out.println("Hi from Java!");
        hello.sayHello();

        //2)Lambda with a parameter
        System.out.println("Exercise #2");
        interface Greeter { void greet(String name); }
        //Greeter greeter = name -> System.out.println("Hello " + name);
        //Task: Change the output to say: "Hi <name>! Have a great day!"
        Greeter greeter = name -> System.out.println("Hi " + name + "! Have a great day!");
        greeter.greet("Alice");

        //3)Lambda with a return value
        System.out.println("Exercise #3");
        //interface Calculator { int add(int a, int b); }
        //Calculator add = (a, b) -> a + b;
        //System.out.println(add.add(5, 3));
        //Task: Change it so that it subtracts instead of adds.
        interface Calculator { int sub(int a, int b); }
        Calculator add = (a, b) -> a - b;
        System.out.println(add.sub(5, 3));

        //4)Multiply two numbers
        System.out.println("Exercise #4");
        interface Multiplier { int mul(int a, int b); }
        Multiplier m = (a, b) -> {
            return a * b;
        };
        System.out.println(m.mul(4,5));

        //5)Use multiple lines in a lambda
        System.out.println("Exercise #5");
        interface SquareCalculator {int square(int x);}
        SquareCalculator s = (x) -> {
            System.out.println("Calculating square...");
            return x*x;
        };
        System.out.println(s.square(12));

        //6)No parameters
        System.out.println("Exercise #6");
        interface PrintRandom {void printRandom();}
        PrintRandom pr = () -> System.out.println((int) (Math.random() * 10 + 1));
        pr.printRandom();

        //7)Explicit vs inferred types
        System.out.println("Exercise #7");
        interface Divider {double divide(double a, double b);}
        Divider dWithType = (double a,double b) -> a/b;
        Divider dNoType = (a,b) -> a/b;
        System.out.println(dWithType.divide(6,3));
        System.out.println(dNoType.divide(6,3));

        //8)Reuse your lambda
        System.out.println("Exercise #8");
        interface Greeter2 { void greet(String name); }
        Greeter2 greeter2 = (name) -> System.out.println("Hello, " + name + "!");
        greeter2.greet("Jim");
        greeter2.greet("Phil");
        greeter2.greet("Ravi");

        //9)Lambda and local variables
        System.out.println("Exercise #9");
        interface Printer {void print(String text);}
        final String prefix = "Message: ";
        Printer p = (text) -> System.out.println(prefix + text);
        p.print("Hello World!");
        //Task: Try changing prefix after defining the lambda — what happens?
        //does not compile since local variable used in lambda has to be final

        //10)Lambdas inside a loop
        System.out.println("Exercise #10");
        interface NumberChecker { void check(int n); }
        NumberChecker checker = (n) -> {
            System.out.print(n);
            if (n%2==0) {
                System.out.println(" is even");
            } else {
                System.out.println(" is odd");
            }
        };
        //Test: Loop through numbers 1–5 and call the lambda each time.
        for (int i = 1; i <= 5; i++) {
            checker.check(i);
        }
        //BELOW ARE OPTIONAL (if have extra time)
        //11)Passing a lambda to a method (intro)
        System.out.println("Exercise #11");
        Action action = () -> System.out.println("Running from lambda!");
        action.run();

        //12)Passing different lambdas


        //System.out.println("Exercise #12");
        //perform(() -> System.out.println("Start!"));
        //perform(() -> System.out.println("Still running..."));
        //perform(() -> System.out.println("Done!"));

        //13)Lambda with input in a method


        //System.out.println("Exercise #13");
        //interface MessageHandler { void handle(String message); }
        //void sendMessage(MessageHandler handler) { handler.handle("Hello from method!"); }
        //sendMessage(msg -> System.out.println(msg.toUpperCase()));

        //14)Lambda returning a result through a method


        //System.out.println("Exercise #14");
        //interface Operation { int apply(int a, int b); }
        //void calculate(Operation op) { System.out.println(op.apply(8, 2)); }
        //calculate((a, b) -> a + b);
        //calculate((a, b) -> a - b);
        //calculate((a, b) -> a * b);

        //15)Lambda used in an array loop


        //System.out.println("Exercise #15");
        //interface NamePrinter { void print(String name); }
        //String[] names = {"Alice","Bob","Charlie"};
        //NamePrinter np = name -> System.out.println("Name: " + name);
        //for(String name : names) np.print(name);

        //16)Return a lambda from a method


        //System.out.println("Exercise #16");
        //interface MathAction { int act(int a, int b); }
        //MathAction getAdder() { return (a, b) -> a + b; }
        //System.out.println(getAdder().act(3, 7));

        //17)Store lambdas in variables


        //System.out.println("Exercise #17");
        //Printer normalPrinter = text -> System.out.println(text);
        //Printer upperPrinter = text -> System.out.println(text.toUpperCase());
        //normalPrinter.print("hello");
        //upperPrinter.print("hello");

        //18)Lambdas calling other methods


        //System.out.println("Exercise #18");
        //interface StringAction { void act(String text); }
        //StringAction sa = text -> System.out.println(text.toLowerCase());
        //sa.act("JAVA");

        //19)Passing lambdas to choose behavior


        //System.out.println("Exercise #19");
        //interface Transformer { String transform(String text); }
        //void process(Transformer t, String text) { System.out.println(t.transform(text)); }
        //process(t -> t.toUpperCase(), "hello");
        //process(t -> new StringBuilder(t).reverse().toString(), "hello");
        //process(t -> t + "!!!", "hello");

        //20)Combine knowledge (mini challenge)


        //System.out.println("Exercise #20");
        //interface Filter { boolean test(int number); }
        //void filterNumbers(Filter f, int[] numbers) {
        //for(int n : numbers) if(f.test(n)) System.out.println(n);}
        //int[] arr = {1,2,3,6,7,9};
        //filterNumbers(n -> n % 2 == 0, arr); //even numbers
        //filterNumbers(n -> n > 5, arr);      //numbers > 5
        //filterNumbers(n -> n % 3 == 0, arr); //divisible by 3
    }
}

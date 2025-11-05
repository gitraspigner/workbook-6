package com.pluralsight.GenericMiniExercises;
/**
 * The main test program containing descriptions and all mini exercises on Generics in Java.
 * Each solution can be found within a class (or classes) within the
 * com.pluralsight.GenericMiniExercises package. Only the test code for exercise
 * #13 has been modified by me to match trying something different in implementation (which
 * is: using inner classes).
 *
 * @author Ravi Spigner
 */
public class GenericMiniExercises {
    public static void main(String[] args) {
        // 1) Box
        // Build: Class Box<T> with: a private T value, constructor, get() that returns what's in the box.
        // Try:
        System.out.println("Exercise #1");
        Box<Integer> a = new Box<>(42);
        Box<String> b = new Box<>("hi");
        System.out.println(a.get()); // 42
        System.out.println(b.get()); // hi
        // 2) Holder with setter
        // Build: Holder<T> with T value, constructor, get(), set(T v).
        // Try:
        System.out.println("Exercise #2");
        Holder<Double> h1 = new Holder<>(3.14);
        Holder<Character> h2 = new Holder<>('Z');
        h1.set(2.71);
        System.out.println(h1.get()); // 2.71
        System.out.println(h2.get()); // Z
        // 3) Labelled
        // Build: Labelled<T> with fields String label and T value. toString() returns "label=value".
        // Try:
        System.out.println("Exercise #3");
        Labelled<String> l1 = new Labelled<>("name", "Maaike");
        Labelled<Integer> l2 = new Labelled<>("age", 29);
        System.out.println(l1); // name=Maaike
        System.out.println(l2); // age=29
        // 4) Wrapper with equalsByValue
        // Build: Wrapper<T> with T value and method boolean equalsByValue(Wrapper<T> other)
        // Try:
        System.out.println("Exercise #4");
        Wrapper<String> w1 = new Wrapper<>("cat");
        Wrapper<String> w2 = new Wrapper<>("cat");
        System.out.println(w1.equalsByValue(w2)); // true
        Wrapper<Integer> w3 = new Wrapper<>(1);
        Wrapper<Integer> w4 = new Wrapper<>(2);
        System.out.println(w3.equalsByValue(w4)); // false
        // 5) Printer
        // Build: Printer<T> with method void print(T x) that just System.out.println(x)
        // Try:
        System.out.println("Exercise #5");
        Printer<String> ps = new Printer<>();
        Printer<Boolean> pb = new Printer<>();
        ps.print("Hi");
        pb.print(true);
        // 6) OptionalLite
        // Build: OptionalLite<T> with private T value;
        //   static <T> OptionalLite<T> of(T v)
        //   static <T> OptionalLite<T> empty() (store null)
        //   boolean isPresent()
        //   T get() (just return value)
        // Try:
        System.out.println("Exercise #6");
        OptionalLite<String> o1 = OptionalLite.of("x");
        OptionalLite<String> o2 = OptionalLite.empty();
        System.out.println(o1.isPresent()); // true
        System.out.println(o2.isPresent()); // false
        // 7) PairStringify
        // Build: PairStringify<T> with String stringify(T a, T b) returning a + "," + b
        // Try:
        System.out.println("Exercise #7");
        PairStringify<Integer> p1 = new PairStringify<>();
        PairStringify<String>  p2 = new PairStringify<>();
        System.out.println(p1.stringify(1, 2));     // 1,2
        System.out.println(p2.stringify("a","b"));  // a,b
        // 8) StoreOnce
        // Build: StoreOnce<T> with void put(T v) that can be called once (ignore extra puts), and T get()
        // Try:
        System.out.println("Exercise #8");
        StoreOnce<String> s1 = new StoreOnce<>();
        StoreOnce<Integer> s2 = new StoreOnce<>();
        s1.put("first"); s1.put("second");
        System.out.println(s1.get()); // first
        s2.put(10);
        System.out.println(s2.get()); // 10
        // 9) Pair<K,V>
        // Build: Immutable Pair<K,V> with fields, constructor, K key(), V value(), and toString() like (key=value)
        // Try:
        System.out.println("Exercise #9");
        Pair<String,Integer> pair1 = new Pair<>("age", 30);
        Pair<Integer,String> pair2 = new Pair<>(1, "one");
        System.out.println(pair1); // (age=30)
        System.out.println(pair2); // (1=one)
        // 10) BiHolder<A,B> with swap()
        // Build: BiHolder<A,B> with A first; B second; + swap() that returns a new BiHolder<B,A> with fields swapped
        // Try:
        System.out.println("Exercise #10");
        BiHolder<String,Boolean> bh = new BiHolder<>("ok", true);
        BiHolder<Boolean,String> swapped = bh.swap();
        System.out.println(swapped.getFirst()); // true
        System.out.println(swapped.getSecond()); // ok
        // 11) Mapper<I,O>
        // Build: Interface Mapper<I,O> with method O map(I input).
        // Make a class ToLength implements Mapper<String,Integer> and another ToString implements Mapper<Double,String>
        // Try:
        System.out.println("Exercise #11");
        Mapper<String,Integer> m1 = new ToLength();
        Mapper<Double,String>  m2 = new ToString();
        System.out.println(m1.map("hello")); // 5
        System.out.println(m2.map(3.14));    // "3.14"
        // 12) BiLabelled<K,V>
        // Build: BiLabelled<K,V> with fields String leftLabel, K left, String rightLabel, V right
        // Add String describe() => "leftLabel=left, rightLabel=right"
        // Try:
        System.out.println("Exercise #12");
        BiLabelled<String,Integer> bl = new BiLabelled<>("name","Zia","age",3);
        System.out.println(bl.describe()); // name=Zia, age=3
        BiLabelled<Integer,String> bl2 = new BiLabelled<>("id",101,"tag","cat");
        System.out.println(bl2.describe());
        // 13) Result<T,E> (success or error)
        // Build: Sealed-feeling lite version:
        //   Interface Result<T,E>
        //   Class Ok<T,E> holds T value
        //   Class Err<T,E> holds E error
        // Add helpers: static <T,E> Result<T,E> ok(T v) and static <T,E> Result<T,E> err(E e) in a Results factory
        // Try:
        System.out.println("Exercise #13");
        Result<Integer,String> r1 = Result.Results.ok(200);
        Result<Integer,String> r2 = Result.Results.err("Not found");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 instanceof Result.Ok);  // true
        System.out.println(r2 instanceof Result.Err); // true
    }
}

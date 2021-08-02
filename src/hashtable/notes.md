# Things to learn

## inner class and nested static class
[GeekForGeeks](https://www.geeksforgeeks.org/static-class-in-java/)
The main difference is that nested static class can be created without
an instance of outer class.
It can only access the static members of outer class.

If it is a static nested class, the generic parameter hiding problem is not there, in contrast to the inner class.
A static nested class is instantiated with:
```
	OuterClass.nestedStaticClass inner = new OuterClass.NestedStaticClass();
```
whereas inner classes creates the outer object;
```
	OuterClass.InnerClass inner = new Outerclass.new InnerClass();
```
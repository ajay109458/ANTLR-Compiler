# ANTLR-Compiler
A compiler written in Java which compiles OHPL (Our Hackathon Programming Language) to JVM Bytecode.
The parser was generated with ANTLR and the compiler uses multiple of the by ANTLR recommended interfaces for interacting with the parsetree.
A profiler which extends the compiler was created since the compiler finished early.

# Steps 
1. Clone the project on your local machine. 
2. Open the project in intelliJ. 
3. Go to File > Project Structure >  Modules > Add Lib (From maven) - Antlr Tool Version 4.13
4. Install IntelliJ plugin ANTLR
5. Generate the parser file.
6. Build project from Intellj menu > Build
7. Go the `compiler` file, Run `main` with configuration. Add runtime parameters `./examples/ajay.ohpl ./examples` 

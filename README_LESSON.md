Java Learning — runnable examples and notes

Quick start

- Build all examples:

  ```bash
  bash build_all.sh
  ```

- Run an example (replace NAME with class name):

  ```bash
  bash run_example.sh HelloWorld
  ```

Examples included

- HelloWorld: basic program
- DataTypes: primitives and boxing
- ControlFlow: if/switch/loops
- Person / OOPDemo: classes, methods
- CollectionsDemo: lists/maps
- ExceptionsDemo: try/catch + custom exception
- FileIODemo: simple file read/write
- ThreadsDemo: basic threads + AtomicInteger

Notes

- These examples use the default (unnamed) package to keep running simple with `javac`/`java`.
- The build script compiles all `.java` files in `src` into the `classes` folder.

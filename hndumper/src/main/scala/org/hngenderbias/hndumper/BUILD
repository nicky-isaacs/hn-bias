scala_library(
  name = "hndumper",
  srcs = glob(["*.scala"]),
  deps = [],
  visibility = ["//visibility:public"],
)

scala_binary(
    name = "hndumper-bin",
    srcs = [],
    deps = [
        ":hndumper"
    ],
    main_class = "hndumper.src.main.scala.org.hngenderbias.hndumper.Thing",
)

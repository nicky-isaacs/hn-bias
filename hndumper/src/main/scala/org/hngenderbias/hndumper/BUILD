scala_library(
  name = "hndumper",
  srcs = glob(["*.scala"]),
  deps = [
      "@cats_core//jar",
      "@cats_effect//jar",
      "@cats_kernel//jar",
      "@http4s_blaze_client//jar",
      "@http4s_blaze_core//jar",
      "@http4s_dsl//jar",
      "@http4s_client//jar",
      "@http4s_core//jar",
  ],
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

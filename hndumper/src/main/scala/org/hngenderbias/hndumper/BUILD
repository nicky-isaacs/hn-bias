scala_library(
  name = "hndumper",
  srcs = glob(["*.scala"]),
  deps = [
      "@maven//:io_circe_circe_generic_2_12",
      "@maven//:io_circe_circe_literal_2_12",
      "@maven//:org_http4s_http4s_dsl_2_12",
      "@maven//:org_http4s_http4s_client_2_12",
      "@maven//:org_http4s_http4s_blaze_client_2_12",
      "@maven//:org_http4s_http4s_blaze_core_2_12",
      "@maven//:org_http4s_http4s_circe_2_12",
      "@maven//:org_typelevel_cats_effect_2_12",
      "@maven//:io_circe_circe_core_2_12",
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

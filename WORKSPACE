scala_version = "2.12.8"

rules_scala_version="14d9742496859faaf860b1adfc8126f3ed077921" # update this as needed

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
http_archive(
    name = "io_bazel_rules_scala",
    strip_prefix = "rules_scala-%s" % rules_scala_version,
    type = "zip",
    url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip" % rules_scala_version,
)

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories((
    scala_version,
    {
       "scala_compiler": "f34e9119f45abd41e85b9e121ba19dd9288b3b4af7f7047e86dc70236708d170",
       "scala_library": "321fb55685635c931eba4bc0d7668349da3f2c09aee2de93a70566066ff25c28",
       "scala_reflect": "4d6405395c4599ce04cea08ba082339e3e42135de9aae2923c9f5367e957315a"
    }
))

# Needed as a workout for https://github.com/bazelbuild/rules_scala/issues/726
http_archive(
     name = "com_google_protobuf",
     sha256 = "9510dd2afc29e7245e9e884336f848c8a6600a14ae726adb6befdb4f786f0be2",
     urls = ["https://github.com/protocolbuffers/protobuf/archive/v3.6.1.3.zip"],
     strip_prefix = "protobuf-3.6.1.3",
)

# Maven artifacts
maven_jar(
    name = "http4s_core",
    artifact = "org.http4s:http4s-core_2.12:0.20.0",
    sha1 = "3c2c7edc4f0d78024be2dc3b6796b6211b508c50",
)

maven_jar(
    name = "http4s_client",
    artifact = "org.http4s:http4s-client_2.12:0.20.0",
)

maven_jar(
    name = "http4s_dsl",
    artifact = "org.http4s:http4s-dsl_2.12:0.20.0",
    sha1 = "b52090e5763ebce6c084c1e94ccf24e164d94b77",
)

maven_jar(
    name = "http4s_blaze_client",
    artifact = "org.http4s:http4s-blaze-client_2.12:0.20.0",
    sha1 = "42e40a73324194467360527b41d5dd6a34da3a45",
)

maven_jar(
    name = "http4s_blaze_core",
    artifact = "org.http4s:http4s-blaze-core_2.12:0.20.0",
)

maven_jar(
    name = "cats_effect",
    artifact = "org.typelevel:cats-effect_2.12:2.0.0-M1",
)

maven_jar(
    name = "cats_core",
    artifact = "org.typelevel:cats-core_2.12:2.0.0-M1",
)

maven_jar(
    name = "cats_kernel",
    artifact = "org.typelevel:cats-kernel_2.12:2.0.0-M1",
)

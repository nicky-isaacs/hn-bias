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

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-1.2",
    sha256 = "e5c68b87f750309a79f59c2b69ead5c3221ffa54ff9496306937bfa1c9c8c86b",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/1.2.zip"
)



# Needed as a workout for https://github.com/bazelbuild/rules_scala/issues/726
http_archive(
     name = "com_google_protobuf",
     sha256 = "9510dd2afc29e7245e9e884336f848c8a6600a14ae726adb6befdb4f786f0be2",
     urls = ["https://github.com/protocolbuffers/protobuf/archive/v3.6.1.3.zip"],
     strip_prefix = "protobuf-3.6.1.3",
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    name = "maven",
    artifacts = [
        "org.http4s:http4s-core_2.12:0.20.0",
        "org.http4s:http4s-dsl_2.12:0.20.0",
        "org.http4s:http4s-client_2.12:0.20.0",
        "org.http4s:http4s-blaze-client_2.12:0.20.0",
        "org.http4s:http4s-blaze-core_2.12:0.20.0",
        "org.http4s:http4s-core_2.12:0.20.0",
        "org.http4s:http4s-circe_2.12:0.20.0",
        "org.http4s:http4s-jawn_2.12:0.20.0",
        "org.typelevel:cats-effect_2.12:2.0.0-M1",
        "io.circe:circe-generic_2.12:0.10.0-M1",
        "io.circe:circe-literal_2.12:0.10.0-M1",
        "io.circe:circe-core_2.12:0.12.0-M1",
    ],
    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
    fetch_sources = True,   # Fetch source jars. Defaults to False.
)

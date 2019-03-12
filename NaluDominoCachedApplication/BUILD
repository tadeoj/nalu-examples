load("@gwt_2_8_2//bazel:gwt_application.bzl", "gwt_application")

gwt_application(
    name = "NaluDominoCachedApplication",
    srcs = glob(["src/main/java/**/*.java"]),
    compiler_flags = [
        "-strict",
        "-sourceLevel 1.8",
        "-logLevel INFO",
    ],
    compiler_jvm_flags = [
        "-Xmx1G",
    ],
    dev_flags = [
        "-logLevel INFO",
    ],
    dev_jvm_flags = [
        "-Xmx1G",
    ],
    java_roots = [
        "NaluDominoCachedApplication/src/main/java",
    ],
    modules = ["com.github.nalukit.example.nalu.simpleapplication.Application"],
    pubs = glob(
        ["src/main/resources/static/*"],
        exclude_directories = 0,
    ),
    resources = glob(["src/main/resources/**/*"]),
    visibility = ["//visibility:public"],
    deps = [
        "@com_github_nalukit_nalu//jar",
        "@com_github_nalukit_nalu_plugin_core_web//jar",
        "@com_github_nalukit_nalu_plugin_elemental2//jar",
        "@com_github_nalukit_nalu_processor//jar",
        "@com_google_elemental2_elemental2_dom//jar",
        "@org_dominokit_domino_ui//jar",
        "@org_dominokit_domino_ui_sources//jar",
        "@org_jboss_gwt_elemento_elemento_core//jar",
    ],
)

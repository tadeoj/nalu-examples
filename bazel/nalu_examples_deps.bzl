load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")
load("@bazel_tools//tools/build_defs/repo:jvm.bzl", "jvm_maven_import_external")

def nalu_examples_deps():
    if "gwt_2_8_2" not in native.existing_rules():
        git_repository(
            name = "gwt_2_8_2",
            commit = "30672bc682e665ff5436be1ef3b3a724b4c596dc",
            remote = "git@github.com:tadeoj/bazel_gwt_2.8.2.git",
        )

def generated_maven_jars():
    jvm_maven_import_external(
        name = "com_github_nalukit_nalu",
        artifact = "com.github.nalukit:nalu:1.2.0",
        server_urls = ["http://central.maven.org/maven2"],
        licenses = ["notice"],  # Apache 2.0
    )

    jvm_maven_import_external(
        name = "com_github_nalukit_nalu_processor",
        artifact = "com.github.nalukit:nalu-processor:1.2.0",
        server_urls = ["http://central.maven.org/maven2"],
        licenses = ["notice"],  # Apache 2.0
    )

    jvm_maven_import_external(
        name = "com_github_nalukit_nalu_plugin_elemental2",
        artifact = "com.github.nalukit:nalu-plugin-elemental2:1.2.0",
        server_urls = ["http://central.maven.org/maven2"],
        licenses = ["notice"],  # Apache 2.0
    )

    jvm_maven_import_external(
        name = "org_dominokit_domino_ui",
        artifact = "org.dominokit:domino-ui:1.0-20190311.140515-409",
        server_urls = ["https://oss.sonatype.org/content/repositories/snapshots"],
        licenses = ["notice"],  # Apache 2.0
    )

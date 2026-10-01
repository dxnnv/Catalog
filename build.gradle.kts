plugins {
    id("version-catalog")
    id("maven-publish")
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/") {
        name = "papermc"
    }
    maven("https://jitpack.io") {
        name = "jitpack"
    }
    maven("https://oss.sonatype.org/content/groups/public/") {
        name = "sonatype"
    }
    maven("https://repo.xenondevs.xyz/releases") {
        name = "xenondevsReleases"
    }
    maven("https://repo.aikar.co/content/groups/aikar/") {
        name = "aikar"
    }
    maven("https://repo.extendedclip.com/releases/") {
        name = "extendedclip"
    }
    maven("https://maven.enginehub.org/repo/") {
        name = "engineHub"
    }
    maven("https://repo.dmulloy2.net/repository/public/") {
        name = "ProtocolLib"
    }
    maven("https://repo.codemc.io/repository/maven-releases/") {
        name = "PacketEvents"
    }
    maven("https://repo.opencollab.dev/main/") {
        name = "Geyser"
    }
}

catalog {
    versionCatalog {
        fun VersionCatalogBuilder.lib(
            group: String,
            artifact: String,
            verRef: String? = artifact,
            alias: String = artifact,
        ) = library(alias, group, artifact).apply {
            verRef?.let(::versionRef) ?: withoutVersion()
        }

        // Versions
        version("infrastructure", "5.3.0")
        // renovate: depName=io.papermc.paper:paper-api registryUrl=https://repo.papermc.io/repository/maven-public/
        version("paper", "1.21.11-R0.1-SNAPSHOT")
        // renovate: depName=com.velocitypowered:velocity-api registryUrl=https://repo.papermc.io/repository/maven-public/
        version("velocity", "3.5.0-SNAPSHOT")
        // renovate: depName=com.h2database:h2
        version("h2", "2.4.240")
        // renovate: depName=org.xerial:sqlite-jdbc
        version("sqlite", "3.51.3.0")
        // renovate: depName=org.mongodb:mongodb-driver-sync
        version("mongodb", "5.6.4")
        // renovate: depName=org.mariadb.jdbc:mariadb-java-client
        version("mariadb", "3.5.7")
        // renovate: depName=com.mysql:mysql-connector-j
        version("mysql", "9.6.0")
        // renovate: depName=com.zaxxer:HikariCP
        version("hikari", "7.0.2")
        // renovate: depName=com.github.ben-manes.caffeine:caffeine
        version("caffeine", "3.2.3")
        // renovate: depName=org.jetbrains.exposed:exposed-bom
        version("exposed", "1.1.1")
        // renovate: depName=org.reflections:reflections
        version("reflections", "0.10.2")
        // renovate: depName=org.jetbrains.kotlinx:kotlinx-coroutines-core
        version("coroutines", "1.10.2")
        // renovate: depName=com.google.code.gson:gson
        version("gson", "2.13.2")
        // renovate: depName=org.slf4j:slf4j-api
        version("slf4j", "2.0.17")
        // renovate: depName=co.aikar:acf-paper registryUrl=https://repo.aikar.co/content/groups/aikar/
        version("acf", "0.5.1-SNAPSHOT")
        // renovate: depName=de.rapha149.signgui:signgui
        version("signgui", "2.5.4")
        // renovate: depName=org.bstats:bstats-bukkit
        version("bstats", "3.2.1")
        // renovate: depName=xyz.xenondevs.invui:invui registryUrl=https://repo.xenondevs.xyz/releases
        version("invui", "1.49")
        // renovate: depName=org.spongepowered:configurate-core
        version("configurate", "4.2.0")
        // renovate: depName=me.clip:placeholderapi registryUrl=https://repo.extendedclip.com/releases/
        version("placeholderapi", "2.12.2")
        // renovate: depName=org.geysermc.floodgate:api registryUrl=https://repo.opencollab.dev/main/
        version("floodgate", "2.2.4-SNAPSHOT")
        // renovate: depName=com.comphenix.protocol:ProtocolLib registryUrl=https://repo.dmulloy2.net/repository/public/
        version("protocollib", "5.4.0-SNAPSHOT")
        // renovate: depName=com.github.retrooper:packetevents-spigot registryUrl=https://repo.codemc.io/repository/maven-releases/
        version("packetevents", "2.13.0")
        // renovate: depName=com.github.MilkBowl:VaultAPI
        version("vault", "1.7.1")
        // renovate: depName=net.luckperms:api
        version("luckperms", "5.4")
        // renovate: depName=com.gitlab.ruany:LiteBansAPI registryUrl=https://jitpack.io
        version("litebans", "0.6.1")
        // renovate: depName=net.dv8tion:JDA
        version("jda", "6.4.1")

        // Infrastructure
        lib("dev.dxnny", "infrastructure", "infrastructure")
        lib("dev.dxnny", "infrastructure-config", "infrastructure")
        lib("dev.dxnny", "infrastructure-database-core", "infrastructure")
        lib("dev.dxnny", "infrastructure-database-exposed", "infrastructure")
        lib("dev.dxnny", "infrastructure-database-hikari", "infrastructure")
        lib("dev.dxnny", "infrastructure-database-sqlite", "infrastructure")
        lib("dev.dxnny", "infrastructure-database-h2", "infrastructure")
        lib("dev.dxnny", "infrastructure-database-mariadb", "infrastructure")
        lib("dev.dxnny", "infrastructure-database-mysql", "infrastructure")

        // Platforms
        lib("io.papermc.paper", "paper-api", "paper", "paperApi")
        lib("com.velocitypowered", "velocity-api", "velocity", "velocityApi")

        // Data handling
        lib("com.h2database", "h2", "h2", "database-h2")
        lib("org.xerial", "sqlite-jdbc", "sqlite", "database-sqlite")
        lib("org.mongodb", "mongodb-driver-sync", "mongodb", "database-mongodb")
        lib("org.mariadb.jdbc", "mariadb-java-client", "mariadb", "database-mariadb")
        lib("com.mysql", "mysql-connector-j", "mysql", "database-mysql")
        lib("com.zaxxer", "HikariCP", "hikari", "database-hikari")
        lib("com.github.ben-manes.caffeine", "caffeine")

        // Exposed
        lib("org.jetbrains.exposed", "exposed-bom", "exposed")
        lib("org.jetbrains.exposed", "exposed-core", null)
        lib("org.jetbrains.exposed", "exposed-jdbc", null)
        lib("org.jetbrains.exposed", "exposed-dao", null)
        lib("org.jetbrains.exposed", "exposed-migration-jdbc", null)

        // Development libraries
        lib("org.reflections", "reflections")
        lib("org.jetbrains.kotlinx", "kotlinx-coroutines-core", "coroutines", "coroutines-core")
        lib("com.google.code.gson", "gson")
        lib("org.slf4j", "slf4j-api", "slf4j")
        lib("co.aikar", "acf-paper", "acf")
        lib("de.rapha149.signgui", "signgui")
        lib("org.bstats", "bstats-bukkit", "bstats")
        lib("xyz.xenondevs.invui", "invui")
        lib("xyz.xenondevs.invui", "invui-kotlin", "invui")
        lib("net.dv8tion", "JDA", "jda", "jda")

        // Configurate
        lib("org.spongepowered", "configurate-core", "configurate")
        lib("org.spongepowered", "configurate-yaml", "configurate")
        lib("org.spongepowered", "configurate-hocon", "configurate")
        lib("org.spongepowered", "configurate-extra-kotlin", "configurate")

        // Plugins
        lib("me.clip", "placeholderapi", "placeholderapi")
        lib("org.geysermc.floodgate", "api", "floodgate", "floodgate")
        lib("com.comphenix.protocol", "ProtocolLib", "protocollib", "protocollib")
        lib("com.github.retrooper", "packetevents-spigot", "packetevents", "packetevents")
        lib("com.github.MilkBowl", "VaultAPI", "vault", "vault")
        lib("net.luckperms", "api", "luckperms", "luckpermsApi")
        lib("com.gitlab.ruany", "LiteBansAPI", "litebans", "litebansApi")

        // WorldEdit/FAWE
        lib("com.fastasyncworldedit", "FastAsyncWorldEdit-Core", null, "fawe-core")
        lib("com.fastasyncworldedit", "FastAsyncWorldEdit-Bukkit", null, "fawe-bukkit")

        bundle("configurate", listOf(
            "configurate-core",
            "configurate-yaml",
            "configurate-hocon",
            "configurate-extra-kotlin"
        ))

        bundle("exposed", listOf(
            "exposed-core",
            "exposed-jdbc",
            "exposed-dao",
            "exposed-migration-jdbc"
        ))

        bundle("fawe", listOf(
            "fawe-core",
            "fawe-bukkit"
        ))
    }
}

publishing {
    repositories {
        mavenLocal()
    }

    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}
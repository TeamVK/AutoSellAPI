# AutoSellAPI

This is an auto generated set of classes with empty public methods from AutoSell plugin.

Any developers who does not have a legit copy of AutoSell but wishes to create a plugin that invokes AutoSell's method can use this resoruce in your dev environment.

## Using maven repository
`AutoSellAPI` is hosted on TeamVK's public maven repository and you can reference it in your dev environment.

### Gradle
Here is an example of a fragment of the script you can add to your build.gradle.

```
plugins {
    id "com.github.unafraid.gradle.git-repo-plugin" version "2.0.4.1"
    id "java"
    id "maven-publish"
}

// this will allow you to use github() to specify the github hosted maven repository
apply plugin: "com.github.unafraid.gradle.git-repo-plugin"

repositories {
    jcenter()
    mavenCentral()
    github("teamvk", "maven-repository", "origin", "master", "release")
}

dependencies {
    // ... other dependencies
    compile group: 'org.spigotmc', name: 'spigot', version: spigot_version
    compile group: 'me.clip.autosell', name: 'AutoSellAPI', version: '1.9.3'
    // ... other dependencies
}
```

## [API Documentation](https://teamvk.github.io/AutoSellAPI/javadoc/index.html/)

## [Donation](http://PayPal.Me/vk2gpz)
It would be greatly appreciated for your donation to continue providing support for this plugin.

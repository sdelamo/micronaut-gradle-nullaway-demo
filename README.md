Demo of a Gradle Micronaut Application which uses [NullAway](http://github.com/uber/NullAway). The build fails because, at compilation, `NullAway` detects a possible NPE. 

- It [adds the Error-prone Gradle Plugin](https://github.com/tbroyer/gradle-errorprone-plugin). 
- It [adds the JSpecify dependency](https://github.com/sdelamo/micronaut-gradle-nullaway-demo/blob/main/build.gradle.kts#L25). 
- It [adds Error Prone Core](https://github.com/sdelamo/micronaut-gradle-nullaway-demo/blob/main/build.gradle.kts#L27) with `errorprone` Gradle Configuration. 
- It [adds NullAway](https://github.com/sdelamo/micronaut-gradle-nullaway-demo/blob/main/build.gradle.kts#L26) with `errorprone` Gradle Configuration.
- [It configures the error prone plugin](https://github.com/sdelamo/micronaut-gradle-nullaway-demo/blob/main/build.gradle.kts#L29-L38).
  - `check("NullAway", CheckSeverity.ERROR)` sets `NullAway` issues to the error level. 
  - `option("NullAway:AnnotatedPackages", “example.micronaut”)` tells `NullAway+ that source code in packages under the `example.micronaut` namespace should be checked for null dereferences and proper usage of `@Nullable ` annotations, and that class files in these packages should be assumed to have correct usage of `@Nullable`.
  -  Then, it disables `NullAway` on test code.

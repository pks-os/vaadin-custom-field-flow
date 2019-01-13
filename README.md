# Vaadin CustomField for Flow

Vaadin CustomField for Flow is a UI component add-on for Vaadin.

## License & Author

Apache License 2.0

Vaadin CustomField is written by Vaadin Ltd.

### Installing
Add CustomField to your project
```xml
<dependencies>
  <dependency>
    <groupId>com.vaadin</groupId>
    <artifactId>vaadin-custom-field-flow</artifactId>
    <version>${vaadin.customfield.version}</version>
  </dependency>
</dependencies>
```

### Using Vaadin CustomField

[<img src="https://raw.githubusercontent.com/vaadin/vaadin-custom-field/master/screenshot.gif" width="700" alt="Screenshot of vaadin-custom-field">](https://vaadin.com/components/vaadin-custom-field)

#### Basic use
```java
CustomField component = new CustomField();
```

## Setting up for development

Clone the project in GitHub (or fork it if you plan on contributing)

```
git clone git@github.com:vaadin/vaadin-custom-field-flow.git
```

To build and install the project into the local repository run

```mvn install -DskipITs```

in the root directory. `-DskipITs` will skip the integration tests, which require a TestBench license. If you want to run all tests as part of the build, run

```mvn install```

To compile and run demos locally execute

```
mvn compile
mvn -pl vaadin-custom-field-flow-demo -Pwar jetty:run
```
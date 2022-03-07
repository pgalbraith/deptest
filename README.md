Simple example demonstrating IntelliJ bug https://youtrack.jetbrains.com/issue/IDEA-220528.

The run configuration at .idea/runConfigurations/Main.xml should work, but if IntelliJ is configured to delegate to gradle for build/run, running this fails with a ClassNotFound exception.

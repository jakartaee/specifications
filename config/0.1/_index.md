---
title: "Jakarta Config 0.1 (under development)"
date: 2022-11-16
summary: "Jakarta Config is a Jakarta EE specification project. It defines a core framework for the Jakarta EE platform allowing applications and other Jakarta EE components to read configuration data from different environment-aware sources in a portable way."
---

Jakarta Config defines a core framework for the Jakarta EE platform allowing applications and other Jakarta EE components to read configuration data from different environment-aware sources in a portable way.

Jakarta Config 0.1 release is considered as MVP (Minimum Viable Product). The main goal is to demonstrate progress and collect feedback from the community.

# MVP Scope

1. Configuration is provided by configuration objects only

```
@Configuration
interface MyConfig {
	Integer getConfigProperty1();
	String getConfigProperty2();
	MyConfigObject getMyConfigObject();
}
```

2. Programmatic API is used to load a configuration object. It's the core functionality. There are no dependencies to other components.

```
MyConfig myConfig = ConfigLoader.load(...);
```

3. Configuration objects also can be injected if Jakarta Inject or Jakarta CDI is used. It's optional. This functionality is defined in another artifact having dependency to the corresponding injection API.

```
@Inject
@ConfigObject
MyConfig myConfig;
```

Samples don't represent the real APIs to create and provided only for idea demonstration.

Minimum Java SE version is 17.
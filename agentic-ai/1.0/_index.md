---
title: "Jakarta Config 1.0 (under development)"
date: 2022-11-16
summary: "Jakarta Config is a Jakarta EE specification project. It defines a core framework for the Jakarta EE platform allowing applications and other Jakarta EE components to read configuration data from different environment-aware sources in a portable way."
---

Jakarta Config defines a core framework for the Jakarta EE platform allowing applications and other Jakarta EE components to read configuration data from different environment-aware sources in a portable way.

Jakarta Config is planning to release the first MVP (Minimum Viable Product) version. The main goal is to demonstrate progress and collect feedback from the community.

## MVP Scope

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

## Additional Information

- Minimum Java SE version is 17.
- [Jakarta Config 0.1 Release Record](https://projects.eclipse.org/projects/ee4j.jakartaconfig/releases/0.1)

## How to communicate with the team

- [config-dev mailing list](https://accounts.eclipse.org/mailing-list/config-dev)
- [Issues Tracker](https://github.com/eclipse-ee4j/config/issues)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2023/01/26 with the following results.

| Representative                     | Representative for: |  Vote   |
|------------------------------------|---------------------|---------|
| Kenji Kazumura                     | Fujitsu             |   +1    |
| Tom Watson, Emily Jiang            | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov          | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht      | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro | Tomitribe           |   +1    |
| Ivar Grimstad                      | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members |   +1    |
| Werner Keil                        | Committer Members   |   +1    |
| Zhai Luchao                        | Enterprise Members  |   +1    |
| Scott Stark                        | Enterprise Members  |   +1    |
|                                    | **Total**           | **10**  |

Non-binding votes

| Representative | Representative for: |  Vote   |
|----------------|---------------------|---------|
| Reza Rahman    |                     |   +1    |
| Jun Qian       | Primeton            |   +1    |
|                | **Total**           |  **2**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02821.html)
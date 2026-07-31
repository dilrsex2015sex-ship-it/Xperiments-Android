```markdown
# Xperiments-Android Development Patterns

> Auto-generated skill from repository analysis

## Overview
This skill teaches the core development patterns and conventions used in the Xperiments-Android repository, which is a Kotlin-based Android project. The repository follows consistent coding styles for file naming, imports, and exports, and uses freeform commit messages. While no specific frameworks or automated workflows are detected, this guide documents the established patterns to ensure code consistency and maintainability.

## Coding Conventions

### File Naming
- **Convention:** PascalCase for file names.
- **Example:**  
  ```plaintext
  MainActivity.kt
  UserProfileScreen.kt
  ```

### Import Style
- **Convention:** Relative imports are used throughout the codebase.
- **Example:**
  ```kotlin
  import com.example.xperimentsandroid.ui.MainActivity
  import com.example.xperimentsandroid.data.UserRepository
  ```

### Export Style
- **Convention:** Named exports are used for classes, functions, and objects.
- **Example:**
  ```kotlin
  class UserProfileViewModel { ... }
  fun fetchUserData() { ... }
  object Constants { ... }
  ```

### Commit Messages
- **Type:** Freeform, with no strict prefixes.
- **Average Length:** 53 characters.
- **Example:**
  ```
  Add new feature for user authentication
  Fix bug in data synchronization logic
  ```

## Workflows

_No automated workflows were detected in this repository. All processes are manual and developer-driven._

## Testing Patterns

- **Framework:** Unknown (not detected).
- **File Pattern:** Test files follow the `*.test.ts` naming convention, suggesting some TypeScript-based testing (possibly for multiplatform or tooling scripts).
- **Example:**
  ```plaintext
  UserRepository.test.ts
  AuthService.test.ts
  ```
- **Note:** Since the main codebase is Kotlin, ensure that any TypeScript tests are run using the appropriate tooling.

## Commands

| Command         | Purpose                                  |
|-----------------|------------------------------------------|
| /create-file    | Create a new Kotlin file using PascalCase |
| /import-module  | Import a module using relative import     |
| /export-symbol  | Export a class, function, or object      |
| /run-tests      | Run all test files matching *.test.ts     |

```
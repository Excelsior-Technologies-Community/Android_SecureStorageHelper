## Android Secure Storage Helper
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9-blue?logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-green)](LICENSE)
[![API](https://img.shields.io/badge/API-24%2B-orange)](#)

A lightweight Kotlin library for securely storing sensitive data in Android using EncryptedSharedPreferences from Jetpack Security.

This library provides a simple, clean API for securely saving and retrieving data such as tokens, user credentials, and other sensitive information.

---

### Features

- Secure storage using AES-256 encryption
- Built on Jetpack Security Crypto
- Simple and developer-friendly API
- Supports multiple data types
- Minimal setup
- Lightweight and fast

---

## Installation

### Step 1: Add JitPack

```gradle
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

### Step 2: Add Dependency

```gradle
dependencies {
	        implementation 'com.github.Excelsior-Technologies-Community:Android_SecureStorageHelper:1.0.0'
	}
```

---

## Usage

## 1️⃣ Initialize SecureStorage

Before using the library, initialize it in your **Application class** or **Activity**.

```kotlin
SecureStorage.init(context)
```

You can also provide a **custom preference name**:

```kotlin
SecureStorage.init(context, "my_secure_storage")
```

---

## 2️⃣ Save Data

### Save String

```kotlin
SecureStorage.putString("token", "abc123")
```

### Save Int

```kotlin
SecureStorage.putInt("age", 25)
```

### Save Boolean

```kotlin
SecureStorage.putBoolean("isLoggedIn", true)
```

### Save Float

```kotlin
SecureStorage.putFloat("price", 9.99f)
```

### Save Long

```kotlin
SecureStorage.putLong("timestamp", 123456789L)
```

---

## 3️⃣ Retrieve Data

### Get String

```kotlin
val token = SecureStorage.getString("token")
```

### Get Int

```kotlin
val age = SecureStorage.getInt("age")
```

### Get Boolean

```kotlin
val isLoggedIn = SecureStorage.getBoolean("isLoggedIn")
```

### Get Float

```kotlin
val price = SecureStorage.getFloat("price")
```

### Get Long

```kotlin
val timestamp = SecureStorage.getLong("timestamp")
```

---

## 4️⃣ Remove Data

### Remove a specific key

```kotlin
SecureStorage.remove("token")
```

### Clear all stored data

```kotlin
SecureStorage.clear()
```

---

## Example

```kotlin
SecureStorage.init(this)

SecureStorage.putString("email", "user@example.com")
SecureStorage.putBoolean("loggedIn", true)

val email = SecureStorage.getString("email")
val isLoggedIn = SecureStorage.getBoolean("loggedIn")
```

---

### License

```
MIT License

Copyright (c) 2025 Excelsior Technologies 

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

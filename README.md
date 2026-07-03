PesaLink Notification

Small Java/Maven project implementing various notifiers (SMS, Email, Push, WhatsApp).

## Overview

- Package: `com.pesalink.notification`
- Main class: `com.pesalink.notification.Main`

## Build

Requires Maven and a JDK. From the repository root run:

```bash
mvn clean package
```

## Run

After building, run the app with:

```bash
java -cp target/classes com.pesalink.notification.Main
```

Or run via Maven:

```bash
mvn exec:java -Dexec.mainClass="com.pesalink.notification.Main"
```

## Project Structure

- `src/main/java/com/pesalink/notification/` — source files including `NotificationService.java`, `Notifier` implementations, and `Main.java`.

## Notes

- Adjust runtime classpath if the project is packaged as a jar.
- Ask me to run the build or add a CI workflow if you want.

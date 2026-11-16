# Blinkit Clone App

Searchable grocery catalog, filters, details, cart quantities, delivery address, checkout and order history. Release is in local demo mode; Firebase Auth/Firestore need your config.

# Blinkit Clone App

A native Android quick-commerce assignment for Pynexia Week 4. It includes a searchable grocery catalog, category filters, cart quantity controls, delivery details, order confirmation, and optional Firebase Authentication / Cloud Firestore integration.

## Demo mode and Firebase setup

Without Firebase configuration, the app uses a clearly labeled local demo catalog and stores the cart on the device. To enable cloud login and real-time catalog/order data, follow `firebase-setup.md`. The APK delivered with this project is in demo mode until you add a Firebase project configuration and rebuild.

## Build and review

Open the project root in Android Studio (JDK 17/21, Android SDK 35). Run `:blinkit:assembleDebug :blinkit:testDebugUnitTest :blinkit:lintDebug`. The common project module is required when opening the included source.

No payment is collected. Product prices and demo orders are training data. Do not use the client-side order amount as a real payment record.


## Published links

- Repository: https://github.com/ENGEyad/pynexia-week4-blinkit
- Hosted overview: https://engeyad.github.io/pynexia-week4-blinkit/
- Project report: https://engeyad.github.io/pynexia-week4-blinkit/downloads/Blinkit-Clone-App-Report.pdf

Build passed; Android Lint reported no issues. Unit tests passed: 8. Emulator UI flows were not run due to low emulator storage. APK and source ZIP are provided in the local submission kit.

# Firebase setup — Blinkit Basket

The app intentionally starts in offline demo mode until you connect your own Firebase project.

1. In Firebase Console, create a project and register an Android app with package name `com.pynexia.week4.blinkit`.
2. Enable **Authentication → Email/Password** and create a **Cloud Firestore** database.
3. Download `google-services.json`, then copy it to `blinkit/src/main/assets/google-services.json` (create the `assets` folder if needed). The file is excluded from Git by `.gitignore`.
4. Add Firestore documents to collection `products`. Each document needs `name` (string), `category` (string), `detail` (string), and `price` (number). The app listens for live catalog updates.
5. Rebuild and install `blinkit`. The banner should say `Firebase connected`; create an account to place cloud orders.

Suggested training rules:

```text
rules_version = '2';
service cloud.firestore {
  match /databases/{database}/documents {
    match /products/{productId} {
      allow read: if true;
      allow write: if false;
    }
    match /orders/{orderId} {
      allow create: if request.auth != null
                    && request.resource.data.userId == request.auth.uid;
      allow read: if request.auth != null
                  && resource.data.userId == request.auth.uid;
      allow update, delete: if false;
    }
  }
}
```

These rules scope order reads to the signed-in user and keep the sample catalog read-only. For production commerce, validate prices and totals in a trusted server or Cloud Function before payment; this practice app does not process payments.

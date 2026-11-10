KUNLIK ISHLAR - Android loyihasi

1. Android Studio ni oching (https://developer.android.com/studio).
2. File > Open ... va shu "KunlikIshlar" papkasini tanlang. Sync tugashini kuting.
3. Telefonni USB bilan ulang (Developer options > USB debugging yoqilgan boʻlsin)
   va yashil Run (▶) tugmasini bosing.
4. APK fayl uchun: Build > Build Bundle(s) / APK(s) > Build APK(s).
   Fayl: app/build/outputs/apk/debug/app-debug.apk

Ilova dizayni: app/src/main/assets/index.html

--- KOMPYUTERSIZ APK YIGʻISH (GitHub orqali, bepul) ---
1. github.com da hisob oching va yangi repository yarating (Add file > Upload files).
2. Shu papkaning ichidagi hamma narsani (app, gradle, build.gradle, settings.gradle,
   gradle.properties) yuklang.
3. "Add file > Create new file" ni bosing, fayl nomiga  .github/workflows/build.yml  deb yozing
   va build.yml faylining ichidagi matnni joylab, Commit qiling.
4. Repository'dagi "Actions" boʻlimiga oʻting. "Build APK" ishi tugashini kuting (2-4 daqiqa).
5. Tugagach oʻsha ishni oching, pastdagi "Artifacts" dan kunlik-ishlar-apk ni yuklab oling.
   Ichidan app-debug.apk chiqadi. Uni telefonga yuborib oʻrnating.

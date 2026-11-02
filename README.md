# 🦊 فاکس فیلم (FoxFilm)

اپلیکیشن اندرویدِ تماشای آنلاین فیلم و سریال — بازسازی‌شده از پروژه‌ی Sketchware به یک **پروژه‌ی استاندارد Gradle / Android Studio**.

این مخزن حاصل بازسازیِ دقیق همان پروژه‌ی اصلی است: **کد برنامه، مسیرها، لینک‌های پخش ویدئو و همه‌ی APIها بدون هیچ تغییری** حفظ شده‌اند و فقط چیزهایی که در خروجی export اسکچ‌ور از دست رفته بودند، به همان شکل اصلی بازگردانده شده‌اند تا پروژه با ابزارهای استاندارد (Android Studio، Gradle و GitHub Actions) کامپایل شود. در بخش «گزارش تغییرات» هر تغییر به‌صورت شفاف مستند شده است.

| مشخصات | مقدار |
|---|---|
| نام پکیج | `zakfilm.ir` |
| نام برنامه | ✅3-فاکس فیلم |
| نسخه | 18.21 (versionCode 19) |
| minSdk | 21 (اندروید ۵ به بالا) |
| targetSdk | 35 |
| compileSdk | 34 |
| زبان | Java (+ یک فایل Kotlin خالی) |
| ابعاد پروژه | ۵۰ فایل جاوا، ۶۸ لی‌آوت، ۸ انیمیشن، فونت Dana |

---

## ✅ وضعیت بیلد

پروژه با موفقیت و به‌طور کامل کامپایل و تست شده است:

- **`assembleDebug`** ← فایل `app-debug.apk` (قابل نصب مستقیم) — بیلد سبز ✔
- **`assembleRelease`** ← فایل `app-release-unsigned.apk` (برای امضا با کلید شما) — بیلد سبز ✔

APK نهایی از تب **Actions** این مخزن (آرتیفکت `FoxFilm-debug-apk`) یا از بیلد محلی خودتان قابل دریافت است.

---

## 🚀 نحوه‌ی بیلد

### روش ۱: اندروید استودیو (پیشنهادی)

1. اندروید استودیو (Ladybug یا جدیدتر) را نصب کنید.
2. این مخزن را clone کنید: `git clone https://github.com/arsansin/FoxFilm.git`
3. از منوی **File → Open** پوشه‌ی پروژه را باز کنید و منتظر سینک Gradle بمانید.
4. دکمه‌ی **Run ▶** را بزنید تا روی دستگاه/شبیه‌ساز نصب شود.

> نیازی به تنظیم دستی SDK نیست؛ اندروید استودیو خودش compileSdk 34 و Build-Tools را دانلود می‌کند.

### روش ۲: خط فرمان

```bash
# پیش‌نیاز: JDK 17 یا 21 + Android SDK (با licences تاییدشده)
./gradlew assembleDebug
# خروجی: app/build/outputs/apk/debug/app-debug.apk
```

### روش ۳: GitHub Actions (خودکار)

با هر push به شاخه‌ی `main` (یا اجرای دستی از تب Actions)، فایل APK به‌صورت خودکار ساخته و در آرتیفکت `FoxFilm-debug-apk` آپلود می‌شود — بدون نیاز به هیچ دستگاه و نرم‌افزاری.

---

## 📋 گزارش تغییرات نسبت به خروجی خام Sketchware (شفافیت کامل)

خروجی export اسکچ‌ور چند کتابخانه و فایل را با خود نمی‌آورد (چون اسکچ‌ور آن‌ها را هنگام بیلد داخلی تزریق می‌کند). برای «بازسازیِ بدون تغییر»، فقط همین موارد ضروری انجام شده است — **هیچ منطق، مسیر، لینک یا API از برنامه تغییر نکرده**:

| # | تغییر | دلیل |
|---|---|---|
| ۱ | افزودن ۵ وابستگی Gradle: ExoPlayer 2.11.8، Adivery SDK 4.9.0، BlurView 1.6.6، ShowCaseView 1.4.1، OverScroll-Decor 1.1.1 | کتابخانه‌های داخلی اسکچ‌ور که در export نبودند؛ کد برنامه به آن‌ها ارجاع دارد و دست‌نخورده باقی مانده |
| ۲ | جایگزینی `firebase-bom:34.1.0` با `firebase-messaging:19.0.0` + `firebase-iid:19.0.0` | نسخه‌های **واقعیِ** همان چیزی که اسکچ‌ور پرو در بیلد اصلی تزریق می‌کرد (طبق BuiltInLibraries خود SW Pro)؛ BOM جدید کلاس `FirebaseInstanceId` را ندارد و کد اصلی با آن کامپایل نمی‌شود |
| ۳ | افزودن پلاگین Kotlin (برای کامپایل `Adivery.kt` خالی) + `jvmTarget 1.8` | الزام AGP جدید |
| ۴ | بازگرداندن ۳ فایل گم‌شده: `SketchApplication.java` و `DebugActivity.java` (عین قالب رسمی Sketchware Pro) و استاب `IABReceiver` (فقط برای resolve شدن ارجاع منیفست؛ کد برنامه از آن استفاده نمی‌کند) | در export حذف شده بودند ولی منیفست به آن‌ها ارجاع دارد |
| ۵ | افزودن پکیج کامل `ir/amirsina/mykey/util/` (IabHelper, IabResult, Inventory, Purchase, SkuDetails, Security, IabException, Base64) + فایل AIDL | کتابخانه‌ی پرداخت درون‌برنامه‌ای مایکت که کد اصلی (BuyEshActivity و NewBuyEshActivity) استفاده می‌کند؛ همان IabHelper کلاسیک گوگل/مایکت با همان API |
| ۶ | تغییر نام ۱۸ فایل drawable دارای خط تیره (`-`) به زیرخط (`_`) + به‌روزرسانی ارجاع‌ها در ۷ لی‌آوت | AAPT2 استاندارد فقط `[a-z0-9_]` را می‌پذیرد؛ محتوای فایل‌ها دست‌نخورده |
| ۷ | بازسازی انیماتور `res/animator/click_zoom.xml` | فایل انیماتور «کلیک بزرگنمایی» در export نبود و نام فارسی‌اش با AAPT2 سازگار نبود؛ همان افکت زوم هنگام لمس بازسازی شد |
| ۸ | حذف یک import اضافی (`com.google.android.material.R`) از `VideoplayerActivity` | آن import کلاس R برنامه را می‌پوشاند و `R.layout.*` را خراب می‌کند |
| ۹ | افزودن cast در `FCMService.java`: `bigLargeIcon((Bitmap) null)` | رفع ابهام overload در androidx جدید؛ رفتار اجرایی دقیقاً یکسان |
| ۱۰ | `android.nonTransitiveRClass=false` در gradle.properties | رفتار R همان نسل قدیمی/اسکچ‌ور تا `R.id.design_bottom_sheet` resolve شود |
| ۱۱ | فعال‌سازی `buildFeatures.aidl` | برای کامپایل AIDL پرداخت مایکت |
| ۱۲ | افزودن Gradle Wrapper 8.13 + فایل‌های مخزن (.gitignore, README, workflow CI) | زیرساخت استاندارد مخزن |

---

## 🧩 کتابخانه‌ها و نسخه‌ها

| کتابخانه | نسخه | منبع | کاربرد |
|---|---|---|---|
| ExoPlayer | 2.11.8 | آینه‌ی JCenter علیون | پخش ویدئو (مستقیم mp4 تا 1080p و HLS) |
| Adivery SDK | 4.9.0 | Maven Central | تبلیغات (بنر، جایزه‌ای) |
| BlurView | 1.6.6 | آینه‌ی JCenter علیون | افکت بلور رابط کاربری |
| ShowCaseView (mreram) | 1.4.1 | JitPack | راهنمای گرافیکی داخل برنامه |
| OverScroll-Decor | 1.1.1 | Maven Central | افکت اسکرول کش‌سانی iOS-مانند |
| Myket IabHelper | (vendored در سورس) | کلاسیک گوگل/مایکت | پرداخت درون‌برنامه‌ای مایکت |
| Firebase Messaging / IID | 19.0.0 | Google Maven | نوتیفیکیشن و توکن |
| Glide، Gson، OkHttp، Lottie، CircleImageView، Material | طبق build.gradle | — | — |

---

## 🌐 سرویس‌ها و APIهای اصلی (همه بدون تغییر)

| دامنه/سرویس | نقش |
|---|---|
| `api.upera.tv/api/v1/ghost/...` | API اصلی محتوا: لیست‌ها، ژانرها، جستجو، بازیگران، کامنت‌ها |
| `relfilm.upera.tv` و `zakfilm.upera.tv` | لینک‌های مستقیم فایل‌های ویدئو (mp4 با کیفیت‌های مختلف تا 1080p) |
| `s35.upera.net` / `cdn.upera.shop` / `thumb.upera.*` | تصاویر بندانگشتی و کاور |
| `www.zakfilm.ir/appfilm` | سرور حساب کاربری: ورود، ثبت‌نام، پروفایل، آپلودها |
| `ir.mservices.market` (مایکت) | پرداخت درون‌برنامه‌ای اشتراک |
| `zarinp.al` / `sepehr.shaparak.ir` / `rubino2.iranlms.ir` | درگاه‌های پرداخت |
| `adivery.com` | شبکه‌ی تبلیغاتی |
| `sartain-3812d.firebaseio.com` | Firebase (همانند نسخه‌ی اصلی) |
| `t.me` | کانال تلگرام پشتیبانی |

> ⚠️ **مثل نسخه‌ی اصلی**، فایل `google-services.json` در پروژه وجود ندارد (پلاگین google-services هم اعمال نشده)؛ بنابراین رفتار Firebase دقیقاً همان رفتار نسخه‌ی اصلی است.

---

## 🔑 ساخت نسخه‌ی release امضاشده

```bash
keytool -genkey -v -keystore foxfilm.jks -keyalg RSA -keysize 2048 -validity 10000 -alias foxfilm
```

سپس در `app/build.gradle` داخل بلوک `android` اضافه کنید:

```gradle
signingConfigs {
    release {
        storeFile file("../foxfilm.jks")
        storePassword "رمز-کی‌استور"
        keyAlias "foxfilm"
        keyPassword "رمز-کلید"
    }
}
```

و در `buildTypes.release` خط `signingConfig signingConfigs.release` را بیفزایید. (فایل keystore هرگز کامیت نشود — در `.gitignore` هم مسدود است.)

---

## 📂 ساختار پروژه

```
FoxFilm/
├── .github/workflows/build-apk.yml   ← ساخت خودکار APK با GitHub Actions
├── gradlew / gradle/wrapper/         ← Gradle Wrapper 8.13
├── build.gradle                      ← تنظیمات ریشه (AGP 8.12.0)
├── settings.gradle
├── gradle.properties
└── app/
    ├── build.gradle                  ← وابستگی‌ها و تنظیمات ماژول
    ├── proguard-rules.pro
    └── src/main/
        ├── AndroidManifest.xml       ← مانیفست اصلی (دست‌نخورده)
        ├── aidl/…/IInAppBillingService.aidl   ← AIDL پرداخت مایکت
        ├── assets/                   ← فونت Dana + فایل‌های Lottie
        ├── java/
        │   ├── ir/amirsina/mykey/util/        ← کتابخانه‌ی IabHelper مایکت
        │   └── zakfilm/ir/                    ← کد اصلی برنامه (۵۰ فایل)
        └── res/                      ← ۶۸ لی‌آوت + drawableها + مقادیر
```

---

## 📜 مجوز

کد این پروژه متعلق به صاحب اثر است. کتابخانه‌ی IabHelper (بازگردانده‌شده) تحت مجوز Apache 2.0 (نمونه‌ی رسمی گوگل/مایکت) است.

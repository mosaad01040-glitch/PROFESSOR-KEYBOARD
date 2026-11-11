<html lang="ar" dir="rtl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>انس البروفيسور - لوحة التحكم</title>
    <style>
        * {
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        body {
            margin: 0;
            padding: 0;
            height: 100vh;
            /* استبدل 'background.jpg' برابط صورتك أو اسم ملفها الصحيح على جهازك */
            background-image: url('background.jpg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            overflow: hidden; /* يمنع السكرول نهائياً وتفضل الشاشة ثابتة */
            display: flex;
            align-items: center;
            justify-content: center;
        }

        /* الحاوية الرئيسية للتطبيق (شاشة واحدة متكاملة) */
        .app-container {
            width: 95vw;
            height: 95vh;
            background: rgba(0, 0, 0, 0.65); /* خلفية سوداء شفافة لتوضيح الصورة وراءها */
            backdrop-filter: blur(12px);     /* تأثير زجاجي ضبابي شيك جداً */
            -webkit-backdrop-filter: blur(12px);
            border-radius: 20px;
            border: 1px solid rgba(255, 255, 255, 0.2);
            padding: 15px;
            color: white;
            display: grid;
            grid-template-rows: auto 1fr;
            gap: 15px;
        }

        /* الهيدر العلوي */
        .header {
            text-align: center;
            font-size: 20px;
            font-weight: bold;
            border-bottom: 1px solid rgba(255, 255, 255, 0.2);
            padding-bottom: 10px;
            color: #00ffcc;
        }

        /* محتوى التطبيق مقسم لشبكة (Grid) في مكان واحد */
        .main-content {
            display: grid;
            grid-template-columns: 1fr 2fr; /* قسمين: جانب للأدوات وجانب للرئيسية */
            gap: 15px;
            height: 100%;
            overflow: hidden;
        }

        @media (max-width: 768px) {
            /* لو الشاشة صغيرة زي الموبايل بالوضع العمودي، نخليها عمود واحد متناسق بدون سكرول */
            .main-content {
                grid-template-columns: 1fr;
                grid-template-rows: auto 1fr;
            }
        }

        .card {
            background: rgba(255, 255, 255, 0.08);
            border-radius: 12px;
            padding: 15px;
            border: 1px solid rgba(255, 255, 255, 0.1);
            display: flex;
            flex-direction: column;
            gap: 10px;
        }

        .card h3 {
            margin: 0 0 5px 0;
            font-size: 16px;
            color: #ffcc00;
            border-bottom: 1px solid rgba(255, 255, 255, 0.1);
            padding-bottom: 5px;
        }

        /* أزرار تفاعلية شيك */
        .btn {
            background: rgba(0, 255, 204, 0.2);
            border: 1px solid #00ffcc;
            color: white;
            padding: 10px;
            border-radius: 8px;
            cursor: pointer;
            font-weight: bold;
            text-align: center;
            transition: 0.3s;
        }

        .btn:hover {
            background: rgba(0, 255, 204, 0.4);
        }

        .dashboard-screen {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100%;
            text-align: center;
            font-size: 18px;
            color: #ddd;
            background: rgba(0, 0, 0, 0.3);
            border-radius: 8px;
        }
    </style>
</head>
<body>

    <div class="app-container">
        <!-- عنوان التطبيق -->
        <div class="header">لوحة تحكم انس البروفيسور</div>
        
        <!-- المحتوى الأساسي للشاشة الواحدة -->
        <div class="main-content">
            <!-- قائمة الأدوات والتحكم -->
            <div class="card">
                <h3>الأدوات السريعة</h3>
                <div class="btn">الرئيسية</div>
                <div class="btn">الإعدادات</div>
                <div class="btn">الحالة</div>
            </div>

            <!-- الشاشة الرئيسية للمحتوى -->
            <div class="card">
                <h3>الشاشة الرئيسية</h3>
                <div class="dashboard-screen">
                    كل بياناتك وعناصرك هنا في مكان واحد بدون أي سكرول!
                </div>
            </div>
        </div>
    </div>

</body>
</html>

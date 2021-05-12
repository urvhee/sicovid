package mtiui.dtpl.sicovid.view.faq

import android.annotation.SuppressLint
import mtiui.dtpl.sicovid.data.FAQ
import mtiui.dtpl.sicovid.view.base.BasePresenter

class FAQPresenter<V : FAQContract.FAQView> : BasePresenter<V>(),
    FAQContract.FAQPresenter<V> {

    override fun initAdapter() {
        getView().createAdapter()
    }

    @SuppressLint("CheckResult")
    override fun initData() {
        val faqs = mutableListOf<FAQ>()
        faqs.add(FAQ(
            "Apa itu coronavirus?",
            "Coronavirus adalah suatu kelompok virus yang dapat menyebabkan penyakit pada hewan atau manusia. Beberapa jenis coronavirus diketahui menyebabkan infeksi saluran nafas pada manusia mulai dari batuk pilek hingga yang lebih serius seperti Middle East Respiratory Syndrome (MERS) dan Severe Acute Respiratory Syndrome (SARS). Coronavirus jenis baru yang ditemukan menyebabkan penyakit COVID-19."
        ))
        faqs.add(FAQ(
            "Apa itu COVID-19?",
            "COVID-19 adalah penyakit menular yang disebabkan oleh jenis coronavirus yang baru ditemukan.  Virus baru dan penyakit yang disebabkannya ini tidak dikenal sebelum mulainya wabah di Wuhan, Tiongkok, bulan Desember 2019. COVID-19 ini sekarang menjadi sebuah pandemi yang terjadi di banyak negara di seluruh dunia."
        ))
        faqs.add(FAQ(
            "Apa saja gejala COVID-19?",
            "Gejala-gejala COVID-19 yang paling umum adalah demam, batuk kering, dan rasa lelah. Gejala lainnya yang lebih jarang dan mungkin dialami beberapa pasien meliputi rasa nyeri dan sakit, hidung tersumbat, sakit kepala, konjungtivitis, sakit tenggorokan, diare, kehilangan indera rasa atau penciuman, ruam pada kulit, atau perubahan warna jari tangan atau kaki. Gejala-gejala yang dialami biasanya bersifat ringan dan muncul secara bertahap. Beberapa orang menjadi terinfeksi tetapi hanya memiliki gejala ringan.\n" +
                "\n" +
                "Sebagian besar (sekitar 80%) orang yang terinfeksi berhasil pulih tanpa perlu perawatan khusus. Sekitar 1 dari 5 orang yang terinfeksi COVID-19 menderita sakit parah dan kesulitan bernapas. Orang-orang lanjut usia (lansia) dan orang-orang dengan kondisi medis penyerta seperti tekanan darah tinggi, gangguan jantung dan paru-paru, diabetes, atau kanker memiliki kemungkinan lebih besar mengalami sakit lebih serius. Namun, siapa pun dapat terinfeksi COVID-19 dan mengalami sakit yang serius. Orang dari segala usia yang mengalami demam dan/atau batuk disertai dengan kesulitan bernapas/sesak napas, nyeri/tekanan dada, atau kehilangan kemampuan berbicara atau bergerak harus segera mencari pertolongan medis. Jika memungkinkan, disarankan untuk menghubungi penyedia layanan kesehatan atau fasilitas kesehatan terlebih dahulu, sehingga pasien dapat diarahkan ke fasilitas kesehatan yang tepat."
        ))
        faqs.add(FAQ(
            "Apa yang harus saya lakukan jika saya memiliki gejala COVID-19 dan kapan saya harus mencari pertolongan medis?",
            "Jika Anda mengalami gejala ringan, seperti batuk ringan atau demam ringan, secara umum tidak perlu mencari pertolongan medis. Tetap di rumah, isolasi diri, dan pantau gejala Anda. Ikuti panduan nasional tentang isolasi mandiri.\n" +
                    "\n" +
                    "Namun, jika Anda tinggal di daerah dengan malaria atau demam berdarah, Anda tidak boleh mengabaikan gejala demam. Segera cari pertolongan medis. Saat Anda pergi ke fasilitas kesehatan, kenakan masker jika memungkinkan, jaga jarak setidaknya 1 meter dari orang lain, dan jangan menyentuh permukaan benda dengan tangan Anda. Jika yang sakit adalah anak, bantu anak untuk mematuhi nasihat ini.\n" +
                    "\n" +
                    "Segera cari perawatan medis jika Anda mengalami kesulitan bernapas atau nyeri/tekanan di dada. Jika memungkinkan, hubungi penyedia layanan kesehatan Anda terlebih dahulu, sehingga Anda dapat diarahkan ke fasilitas kesehatan yang tepat."
        ))
        faqs.add(FAQ(
            "Bagaimana cara COVID-19 menyebar?",
            "Orang dapat tertular COVID-19 dari orang lain yang terinfeksi virus ini. COVID-19 dapat menyebar terutama dari orang ke orang melalui percikan-percikan dari hidung atau mulut yang keluar saat orang yang terinfeksi COVID-19 batuk, bersin atau berbicara. Percikan-percikan ini relatif berat, perjalanannya tidak jauh dan jatuh ke tanah dengan cepat. Orang dapat terinfeksi COVID-19 jika menghirup percikan orang yang terinfeksi virus ini. Oleh karena itu, penting bagi kita untuk menjaga jarak minimal 1 meter dari orang lain. Percikan-percikan ini dapat menempel di benda dan permukaan lainnya di sekitar orang seperti meja, gagang pintu, dan pegangan tangan. Orang dapat terinfeksi dengan menyentuh benda atau permukaan tersebut, kemudian menyentuh mata, hidung, atau mulut mereka. Inilah sebabnya penting untuk mencuci tangan secara teratur dengan sabun dan air bersih mengalir, atau membersihkannya dengan cairan antiseptik berbahan dasar alkohol. WHO terus mengkaji perkembangan penelitian tentang cara penyebaran COVID-19 dan akan menyampaikan temuan-temuan terbaru."
        ))
        faqs.add(FAQ(
            "Apakah COVID-19 dapat menular dari orang yang tidak menunjukkan gejala?",
            "COVID-19 terutama menyebar melalui percikan saluran pernapasan yang dikeluarkan oleh seseorang yang batuk atau memiliki gejala lain seperti demam atau rasa lelah. Banyak orang yang terinfeksi COVID-19 hanya mengalami gejala ringan terutama pada tahap-tahap awal. Karena itu, COVID-19 dapat menular dari orang yang hanya bergejala ringan, seperti batuk ringan, tetapi merasa sehat.\n" +
                    "\n" +
                    "Beberapa laporan menunjukkan bahwa orang tanpa gejala dapat menularkan virus ini namun belum diketahui seberapa sering penularan dengan cara tersebut terjadi. WHO terus mengkaji perkembangan penelitian tentang cara penyebaran COVID-19 dan akan menyampaikan temuan-temuan terbaru."
        ))
        faqs.add(FAQ(
            "Apa yang dapat saya lakukan untuk melindungi diri saya dan orang lain jika tidak mengetahui siapa yang terinfeksi COVID-19?",
            "Mempraktikkan kebersihan tangan dan pernapasan setiap saat sangatlah penting, dan merupakan cara terbaik untuk melindungi orang lain dan diri Anda sendiri.\n" +
                    "\n" +
                    "Apabila memungkinkan, jaga jarak Anda dengan orang lain minimal 1 meter terutama jika berada di dekat orang yang batuk atau bersin. Karena beberapa orang yang terinfeksi mungkin belum menunjukkan gejala atau gejalanya masih ringan, menjaga jarak fisik dengan semua orang adalah upaya terbaik jika Anda berada di daerah di mana COVID-19 menyebar."
        ))
        faqs.add(FAQ(
            "Apa yang sebaiknya saya lakukan jika saya berkontak erat dengan seseorang yang terinfeksi COVID-19?",
            "Jika Anda telah berkontak erat dengan seseorang yang terinfeksi COVID-19 maka Anda kemungkinan akan terinfeksi.\n" +
                    "\n" +
                    "Kontak erat berarti tinggal atau berada dalam jarak kurang dari 1 meter dari orang yang terinfeksi COVID-19. Jika demikian, sangat disarankan untuk tidak meninggalkan rumah.\n" +
                    "\n" +
                    "Namun, jika Anda tinggal di daerah di mana terdapat kasus malaria atau demam berdarah, maka penting untuk tidak mengabaikan gejala demam. Segera cari pertolongan medis. Saat Anda pergi ke fasilitas kesehatan, kenakan masker jika memungkinkan, jaga jarak setidaknya 1 meter dari orang lain, dan jangan menyentuh permukaan dengan tangan Anda. Jika yang sakit adalah anak, bantu anak untuk mematuhi nasihat ini.\n" +
                    "\n" +
                    "Jika Anda tidak tinggal di daerah di mana terdapat kasus malaria atau demam berdarah, lakukanlah hal-hal berikut:\n" +
                    "\n" +
                    "• Jika Anda sakit, meskipun gejalanya sangat ringan, Anda harus melakukan isolasi mandiri.\n" +
                    "• Meskipun Anda tidak menyadari telah terpajan COVID-19 dan mengalami gejala, lakukan isolasi mandiri dan pantau diri Anda.\n" +
                    "• Anda lebih mungkin menginfeksi orang lain pada tahap awal penyakit meskipun gejala Anda ringan; oleh karena itu isolasi mandiri sangatlah penting.\n" +
                    "• Jika Anda tidak memiliki gejala, tetapi telah terpajan orang yang terinfeksi, lakukan karantina mandiri selama 14 hari.\n" +
                    "\n" +
                    "Jika Anda terinfeksi COVID-19 (telah dikonfirmasi dengan tes), lakukan isolasi mandiri selama 14 hari bahkan setelah gejala menghilang sebagai tindakan pencegahan, meskipun belum diketahui secara pasti berapa lama pasien masih dapat menularkan setelah dinyatakan sembuh. Ikuti pedoman nasional tentang isolasi mandiri."
        ))
        faqs.add(FAQ(
            "Apa itu isolasi mandiri?",
            "Isolasi mandiri adalah tindakan penting yang dilakukan oleh orang yang memiliki gejala COVID-19 untuk mencegah penularan ke orang lain di masyarakat, termasuk anggota keluarga.\n" +
                    "\n" +
                    "Isolasi mandiri adalah ketika seseorang yang mengalami demam, batuk, atau gejala COVID-19 lainnya tinggal di rumah dan tidak pergi bekerja, sekolah, atau ke tempat-tempat umum. Hal ini dilakukan secara sukarela atau berdasarkan rekomendasi dari penyedia layanan kesehatan. Namun, jika Anda tinggal di daerah dengan kasus malaria atau demam berdarah, Anda tidak boleh mengabaikan gejala demam. Segera cari pertolongan medis. Saat Anda pergi ke fasilitas kesehatan, kenakan masker jika memungkinkan, jaga jarak setidaknya 1 meter dari orang lain dan jangan menyentuh permukaan benda dengan tangan Anda. Jika yang sakit adalah anak, bantu anak mematuhi nasihat ini.\n" +
                    "\n" +
                    "Jika Anda tidak tinggal di daerah dengan kasus malaria atau demam berdarah, lakukanlah hal-hal berikut:\n" +
                    "\n" +
                    "• Jika seseorang melakukan isolasi mandiri, artinya orang tersebut sedang sakit namun tidak parah (tidak memerlukan pertolongan medis) • Sediakan kamar sendiri yang besar dengan sirkulasi udara yang baik dan dilengkapi sarana mencuci tangan dan toilet.\n" +
                    "• Jika tidak memungkinkan, pisahkan tempat tidur dengan orang lain dengan jarak minimal 1 meter.\n" +
                    "• Tetap jaga jarak minimal 1 meter dengan orang lain, termasuk anggota keluarga.\n" +
                    "• Pantau gejala yang dialami setiap hari.\n" +
                    "• Lakukan isolasi mandiri selama 14 hari meskipun Anda merasa sehat.\n" +
                    "• Jika Anda mengalami kesulitan bernapas, segera hubungi penyedia layanan kesehatan Anda – hubungi terlebih dahulu jika memungkinkan.\n" +
                    "• Tetap positif dan semangat dengan cara tetap menjaga silahturahmi dengan orang-orang tercinta melalui telepon atau media online dan dengan berolahraga di rumah."
        ))
        faqs.add(FAQ(
            "Apa yang sebaiknya saya lakukan jika saya tidak memiliki gejala namun saya merasa terpajan COVID-19? Apakah perlu melakukan karantina mandiri?",
            "Karantina mandiri berarti memisahkan diri dari orang lain karena Anda telah terpajan dengan seseorang yang terinfeksi COVID-19 meskipun Anda tidak memiliki gejala. Selama karantina mandiri, pantau gejala-gejala yang dialami. Tujuan dari karantina mandiri adalah untuk mencegah penularan. Karena orang yang terinfeksi COVID-19 dapat menularkan secara cepat ke orang lain, segera mengarantina diri dapat mencegah orang lain tertular infeksi.\n" +
                    "\n" +
                    "Dalam hal ini:\n" +
                    "\n" +
                    "• Sediakan kamar sendiri yang besar dengan sirkulasi udara yang baik dan dilengkapi sarana mencuci tangan dan toilet.\n" +
                    "• Jika tidak memungkinkan, pisahkan tempat tidur dengan orang lain dengan jarak minimal 1 meter.\n" +
                    "• Tetap jaga jarak minimal 1 meter dengan orang lain, termasuk anggota keluarga. • Pantau gejala yang dialami setiap hari.\n" +
                    "• Lakukan karantina mandiri selama 14 hari meskipun Anda merasa sehat.\n" +
                    "• Jika Anda mengalami kesulitan bernapas, segera hubungi penyedia layanan kesehatan Anda – hubungi terlebih dahulu jika memungkinkan.\n" +
                    "• Tetap positif dan semangat\n" +
                    "\n" +
                    "Namun, jika Anda tinggal di daerah dengan kasus malaria atau demam berdarah, Anda tidak boleh mengabaikan gejala demam. Segera cari pertolongan medis. Saat Anda pergi ke fasilitas kesehatan, kenakan masker jika memungkinkan, jaga jarak setidaknya 1 meter dari orang lain dan jangan menyentuh permukaan benda dengan tangan Anda. Jika yang sakit adalah anak, bantu anak mematuhi nasihat ini."
        ))
        faqs.add(FAQ(
            "Apa perbedaan antara isolasi mandiri, karantina mandiri, dan menjaga jarak fisik?",
            "Karantina berarti membatasi kegiatan atau memisahkan orang yang tidak sakit tetapi mungkin terpajan COVID-19. Tujuannya adalah untuk mencegah penyebaran penyakit pada saat orang tersebut baru mulai mengalami gejala.\n" +
                    "\n" +
                    "Isolasi berarti memisahkan orang yang sakit dengan gejala COVID-19 dan mungkin menular guna mencegah penularan.\n" +
                    "\n" +
                    "Menjaga jarak fisik berarti terpisah secara fisik. WHO merekomendasikan untuk menjaga jarak setidaknya 1 meter dari orang lain. Jarak ini merupakan ukuran umum tentang seberapa jauh semua orang harus saling menjaga jarak walaupun mereka baik-baik saja tanpa diketahui terpajan COVID-19 atau tidak."
        ))
        faqs.add(FAQ(
            "Apa yang dapat saya lakukan untuk melindungi diri saya dan mencegah penyebaran penyakit ini?",
            "Tetap ikuti informasi terbaru tentang wabah COVID-19 yang tersedia di situs web WHO dan melalui kementerian kesehatan dan dinas kesehatan di daerah Anda. Di banyak negara di seluruh dunia, kasus dan bahkan wabah COVID-19 telah terjadi. Pemerintah Tiongkok dan pemerintah beberapa negara lain telah berhasil memperlambat wabah yang terjadi di wilayahnya. Namun, situasi yang ada masih sulit diprediksi. Karena itu, tetaplah ikuti berita terbaru.\n" +
                    "\n" +
                    "Anda dapat mengurangi risiko terinfeksi atau menyebarkan COVID-19 dengan cara melakukan beberapa langkah kewaspadaan:\n" +
                    "\n" +
                    "• Seringlah mencuci tangan Anda dengan air bersih mengalir dan sabun, atau cairan antiseptik berbahan dasar alkohol. Mengapa? Mencuci tangan dengan air bersih yang mengalir dan sabun, atau cairan antiseptik berbahan dasar alkohol dapat membunuh virus di tangan Anda.\n" +
                    "• Jaga jarak setidaknya 1 meter dengan orang lain. Mengapa? Ketika seseorang batuk, bersin, atau bicara, orang tersebut mengeluarkan percikan dari hidung atau mulutnya dan percikan ini dapat membawa virus. Jika Anda terlalu dekat, Anda dapat menghirup percikan ini dan juga virus COVID-19 jika orang tersebut terinfeksi penyakit ini.\n" +
                    "• Hindari pergi ke tempat-tempat ramai. Mengapa? Ketika orang-orang berkumpul bersama dalam kerumunan, Anda memiliki kemungkinan untuk melakukan kontak erat dengan orang yang terinfeksi COVID-19 dan lebih sulit untuk menjaga jarak fisik minimal 1 meter.\n" +
                    "• Hindari menyentuh mata, hidung, dan mulut. Mengapa? Tangan menyentuh berbagai permukaan benda dan virus penyakit ini dapat tertempel di tangan. Tangan yang terkontaminasi dapat membawa virus ini ke mata, hidung, atau mulut, yang dapat menjadi titik masuk virus ini ke tubuh Anda sehingga Anda menjadi sakit.\n" +
                    "• Pastikan Anda dan orang-orang di sekitar Anda menjalankan etika batuk dan bersin dengan cara menutup mulut dan hidung dengan siku terlipat atau tisu saat batuk atau bersin, segera buang tisu bekas tersebut. Mengapa? Percikan dapat menyebarkan virus. Dengan mengikuti etika batuk dan bersin, Anda melindungi orang-orang di sekitar dari virus-virus seperti batuk pilek, flu, dan COVID-19.\n" +
                    "• Tetaplah tinggal di rumah dan lakukan isolasi mandiri meskipun hanya memiliki gejala ringan seperti batuk, sakit kepala, dan demam ringan sampai Anda sembuh. Minta seseorang untuk membawakan persediaan kebutuhan Anda. Jika Anda harus meninggalkan rumah, kenakan masker untuk menghindari penularan ke orang lain. Mengapa? Menghindari kontak dengan orang lain akan melindungi mereka dari kemungkinan penularan COVID-19 dan virus lainnya.\n" +
                    "• Jika Anda demam, batuk, dan kesulitan bernapas, segeralah cari pertolongan medis dan tetap memberitahukan kondisi Anda terlebih dahulu. Ikuti arahan dinas kesehatan setempat Anda.\n" +
                    "Mengapa? Kementerian kesehatan dan dinas kesehatan daerah memiliki informasi terbaru tentang situasi di wilayah Anda. Dengan memberitahukan kondisi Anda terlebih dahulu, petugas kesehatan yang akan merawat Anda dapat segera mengarahkan Anda ke fasilitas pelayanan kesehatan yang tepat. Langkah ini juga melindungi Anda dan membantu mencegah penyebaran virus dan infeksi lainnya.\n" +
                    "• Tetap ikuti informasi terbaru dari sumber terpercaya, seperti WHO, dinas kesehatan daerah, dan kementerian kesehatan. Mengapa? Dinas kesehatan daerah dan kementerian kesehatan adalah sumber terpercaya dalam memberikan arahan kepada masyarakat di wilayahnya tentang apa saja yang harus dilakukan untuk melindungi diri."
        ))
        faqs.add(FAQ(
            "Apakah ada vaksin, obat, atau perawatan untuk COVID-19?",
            "Meskipun beberapa pengobatan barat, tradisional, maupun buatan rumahan dapat meringankan dan mengurangi gejala ringan COVID-19, tidak ada obat yang terbukti dapat mencegah atau menyembuhkan COVID-19. WHO tidak merekomendasikan tindakan mengobati diri sendiri dengan obat apa pun, termasuk antibiotik, untuk mencegah atau menyembuhkan COVID-19. Namun, beberapa uji klinis sedang berlangsung atas obat-obatan barat maupun tradisional. WHO sedang mengoordinasikan upaya-upaya pengembangan vaksin dan obat untuk mencegah dan mengobati COVID-19 dan akan terus memberikan informasi terbaru seiring tersedianya temuan klinis.\n" +
                    "\n" +
                    "Cara efektif untuk melindungi Anda dan orang lain dari COVID-19 adalah:\n" +
                    "• Cuci tangan dengan teratur dan menyeluruh\n" +
                    "• Hindari menyentuh mata, hidung, dan mulut\n" +
                    "• Jalankan etika batuk dan bersin dengan cara menutup mulut dan hidung dengan siku terlipat atau tisu. Jika menggunakan tisu, segera buang setelah digunakan dan cuci tangan.\n" +
                    "• Jaga jarak fisik dengan orang lain setidaknya 1 meter."
        ))
        faqs.add(FAQ(
            "Apakah WHO merekomendasikan penggunaan masker medis dalam mencegah penularan COVID-19?",
            "Saat ini, tidak ada cukup bukti untuk menyarankan atau mencegah penggunaan masker (baik masker medis atau jenis lainnya) oleh orang sehat di masyarakat. Namun, WHO secara aktif terus mengikuti pengetahuan yang terus berubah mengenai penggunaan masker dan terus memperbarui panduannya.\n" +
                    "\n" +
                    "Masker medis direkomendasikan terutama dalam perawatan kesehatan, tetapi dapat dipertimbangkan dalam keadaan lain (lihat di bawah). Masker medis harus dikombinasikan dengan tindakan pencegahan dan pengendalian infeksi utama lain seperti kebersihan tangan dan menjaga jarak fisik.\n" +
                    "\n" +
                    "Tenaga kesehatan\n" +
                    "\n" +
                    "Mengapa? Masker dan respirator medis seperti N95, FFP2, atau yang setara direkomendasikan dan harus dikhususkan bagi petugas layanan kesehatan saat merawat pasien. Kontak erat dengan suspek atau orang yang terkonfirmasi COVID-19 dan lingkungan sekitarnya adalah cara utama penularan; hal ini berarti tenaga kesehatan adalah orang-orang yang paling terpajan.\n" +
                    "Orang yang sakit dan menunjukkan gejala COVID-19 Mengapa? Setiap orang yang sakit dengan gejala ringan seperti nyeri otot, batuk ringan, sakit tenggorokan, atau rasa lelah harus melakukan isolasi di rumah dan menggunakan masker medis sesuai dengan rekomendasi WHO tentang perawatan di rumah untuk pasien suspek COVID-19. Batuk, bersin, atau berbicara dapat menghasilkan percikan yang dapat menjadi sumber penularan. Percikan ini dapat menempel di wajah orang lain di dekatnya dan lingkungan sekitar. Jika orang yang terinfeksi batuk, bersin, atau berbicara saat mengenakan masker medis, penggunaan masker dapat membantu melindungi orang-orang terdekat dari infeksi. Jika orang sakit perlu pergi ke fasilitas kesehatan, mereka harus memakai masker medis.\n" +
                    "Siapa pun yang merawat seseorang di rumah yang terinfeksi COVID-19 Mengapa? Mereka yang merawat orang-orang yang terinfeksi COVID-19 harus mengenakan masker medis untuk perlindungan. Sekali lagi, sering berkontak erat dalam waktu lama dengan orang terinfeksi COVID-19 memberikan risiko tinggi bagi pengasuh. Pengambil kebijakan nasional juga dapat merekomendasikan penggunaan masker medis untuk individu tertentu berdasarkan pendekatan berbasis risiko. Pendekatan ini mempertimbangkan tujuan penggunaan masker, risiko pajanan dan kerentanan pemakainya, tempat, seberapa mungkin masker digunakan, dan jenis masker yang harus dipertimbangkan."
        ))
        faqs.add(FAQ(
            "Bagaimana cara menggunakan masker yang benar?",
            "Jika Anda akan menggunakan masker:\n" +
                    "1. Sebelum menyentuh masker, cuci tangan menggunakan sabun dan air bersih mengalir, atau bersihkan tangan menggunakan cairan antiseptik berbahan dasar alkohol.\n" +
                    "2. Ambil masker dan periksa apakah ada sobekan atau lubang\n" +
                    "3. Tentukan sisi mana yang merupakan sisi atas (tempat pita logam berada)\n" +
                    "4. Pastikan sisi masker yang tepat menghadap ke luar (sisi berwarna).\n" +
                    "5. Tempatkan masker ke wajah Anda. Jepit pita logam atau bagian tepi masker yang kaku sehingga bentuknya sesuai hidung Anda.\n" +
                    "6. Tarik masker ke bawah sehingga menutupi mulut dan dagu Anda.\n" +
                    "7. Jangan menyentuh masker pada saat Anda memakainya sebagai perlindungan.\n" +
                    "8. Setelah digunakan, lepas masker dengan tangan bersih, lepaskan tali elastis dari belakang telinga sambil menjauhkan masker dari wajah dan pakaian Anda, untuk menghindari menyentuh permukaan masker yang mungkin terkontaminasi.\n" +
                    "9. Segera buang masker sekali-pakai di tempat sampah setelah digunakan. Jangan gunakan kembali masker tersebut.\n" +
                    "10. Jaga kebersihan tangan setelah menyentuh atau membuang masker – Gunakan cairan antiseptik berbahan dasar alkohol atau jika terlihat kotor, cuci tangan Anda dengan sabun dan air.\n" +
                    "\n" +
                    "Perlu dipahami bahwa terjadi kekurangan ketersediaan masker di seluruh dunia (baik masker medis maupun masker N95). Masker medis harus dialokasikan sebanyak mungkin untuk tenaga kesehatan.\n" +
                    "\n" +
                    "Perlu diingat bahwa penggunaan masker bukan pengganti bagi cara-cara lain yang lebih efektif untuk melindungi diri sendiri dan orang lain dari COVID-19 seperti sering mencuci tangan, menutup hidung dan mulut dengan lengan yang terlipat atau tisu ketika batuk, dan menjaga jarak setidaknya 1 meter dari orang lain. Lihat langkah-langkah perlindungan dasar terhadap coronavirus baru untuk informasi lebih lanjut.\n" +
                    "Tetap ikuti saran dari kementerian kesehatan Anda tentang penggunaan masker."
        ))
        faqs.add(FAQ(
            "Berapa lama waktu yang diperlukan bagi gejala COVID-19 untuk muncul setelah terjadi pajanan?",
            "Pada umumnya, gejala mulai muncul sekitar lima hingga enam hari setelah terjadi pajanan, tetapi waktu kemunculan gejala ini dapat berkisar dari 1-14 hari."
        ))
        faqs.add(FAQ(
            "Apakah ada hubungan antara COVID-19 dan hewan?",
            "COVID-19 ditularkan dari manusia ke manusia.\n" +
                    "\n" +
                    "Kita sudah banyak mengetahui tentang virus lain dalam keluarga coronavirus dan sebagian besar jenis virus ini berasal dari hewan. Virus COVID-19 (disebut juga SARS-CoV-2) adalah virus baru pada manusia. Kemungkinan hewan sumber COVID-19 saat ini belum dipastikan tetapi penelitian sedang berlangsung.\n" +
                    "\n" +
                    "WHO terus memantau penelitian terbaru tentang ini dan topik COVID-19 lainnya serta akan memberikan pemutakhiran jika temuan baru tersedia."
        ))
        faqs.add(FAQ(
            "Apakah saya dapat tertular COVID-19 dari hewan peliharaan saya?",
            "Beberapa anjing dan kucing (kucing rumah tangga dan harimau) yang berkontak dengan manusia yang terinfeksi dinyatakan positif COVID-19. Selain itu, musang juga rentan terhadap infeksi. Dalam eksperimen, kucing dan musang dapat menularkan infeksi ke hewan lain dari spesies yang sama, tetapi tidak ada bukti bahwa hewan-hewan ini dapat menularkan penyakit ke manusia dan berperan dalam menyebarkan COVID-19. COVID-19 menyebar terutama melalui percikan yang dihasilkan ketika orang yang terinfeksi batuk, bersin, atau berbicara.\n" +
                    "\n" +
                    "Orang yang sakit COVID-19 dan orang-orang yang berisiko direkomendasikan untuk membatasi kontak dengan hewan pendamping dan hewan-hewan lain. Saat menangani dan merawat hewan, langkah-langkah kebersihan dasar harus selalu dilaksanakan termasuk mencuci tangan setelah memegang hewan, makanan, atau persediaan mereka, serta menghindari mencium, menjilat, atau berbagi makanan.\n" +
                    "\n" +
                    "Rekomendasi lainnya tersedia di situs web: https://www.oie.int/en/scientific-expertise/specific-information-and-recommendations/questions-and-answers-on-2019novel-coronavirus/\n" +
                    "\n" +
                    "WHO terus memantau penelitian terbaru tentang ini dan topik COVID-19 lainnya serta akan memberikan pemutakhiran jika temuan baru tersedia."
        ))
        faqs.add(FAQ(
            "Berapa lama virus dapat bertahan di permukaan benda?",
            "Hal yang paling penting untuk diketahui tentang coronavirus pada permukaan benda adalah bahwa coronavirus mudah dibersihkan menggunakan disinfektan rumah tangga biasa yang dapat membunuh virus tersebut. Penelitian telah menunjukkan bahwa virus COVID-19 dapat bertahan hingga 72 jam pada plastik dan stainless steel, kurang dari 4 jam pada tembaga, dan kurang dari 24 jam pada karton.\n" +
                    "\n" +
                    "Pastikan Anda selalu menjaga kebersihan tangan dengan mencuci tangan menggunakan sabun dan air bersih mengalir, atau cairan antiseptik berbahan dasar alkohol. Hindari menyentuh mata, mulut, atau hidung Anda."
        ))
        faqs.add(FAQ(
            "Bagaimana cara mencuci buah dan sayuran?",
            "Buah dan sayuran adalah komponen penting dalam diet sehat. Cuci buah dan sayuran dengan cara yang sama ketika Anda mencucinya dalam keadaan lain: sebelum menyentuh buah dan sayuran, cuci tangan Anda dengan sabun dan air bersih mengalir. Kemudian, cuci buah dan sayuran secara menyeluruh dengan air bersih, terutama jika Anda memakannya dalam keadaan mentah."
        ))
        faqs.add(FAQ(
            "Apakah antibiotik efektif dalam mencegah atau mengobati COVID-19?",
            "Tidak. Antibiotik tidak efektif melawan virus; antibiotik hanya efektif melawan infeksi bakteri. COVID-19 disebabkan oleh virus, sehingga antibiotik tidak efektif melawan COVID-19. Antibiotik tidak boleh digunakan sebagai upaya pencegahan atau pengobatan COVID-19. Di rumah sakit, dokter kadang-kadang akan menggunakan antibiotik untuk mencegah atau mengobati infeksi bakteri sekunder yang dapat menjadi komplikasi COVID-19 pada pasien yang sakit serius. Antibiotik hanya boleh digunakan sesuai dengan anjuran dokter untuk mengobati infeksi bakteri."
        ))
        faqs.add(FAQ(
            "Apakah saya dapat tertular COVID-19 dari kotoran orang yang terinfeksi penyakit ini",
            "Saat ini, penyelidikan awal menunjukkan bahwa virus dapat ada pada kotoran dalam beberapa kasus, tetapi belum ada laporan penularan COVID-19 melalui kotoran. Selain itu, sampai dengan saat ini tidak ada bukti tentang kelangsungan hidup virus COVID-19 di air atau selokan.\n" +
                    "\n" +
                    "WHO sedang mengkaji penelitian yang sedang berlangsung terkait cara penularan COVID-19 dan akan terus menyampaikan temuan baru dalam topik ini."
        ))
        getView().setFAQ(faqs.toTypedArray())
    }
}
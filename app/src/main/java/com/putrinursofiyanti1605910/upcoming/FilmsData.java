package com.putrinursofiyanti1605910.upcoming;

import java.util.ArrayList;

public class FilmsData {
    public static String[][] data = new String[][]{
            {"Goosebumps 2", "Perayaan Halloween sedang ramai-ramainya. Termasuk di sebuah kota kecil Wardenclyffe...", "https://m.media-amazon.com/images/M/MV5BNzgxMDQ2MDUyMF5BMl5BanBnXkFtZTgwNzgyMjQyNjM@._V1_SY1000_CR0,0,674,1000_AL_.jpg"},
            {"Malicious", "Film Horror Malicious (2018) mengisahkan tentang Adam (Josh Stewart) yaitu seorang dosen...", "https://m.media-amazon.com/images/M/MV5BMTIwZDE5ODItZGQ3OC00YmM4LTg3Y2ItNTliOWQwOGY5OWFkL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjEwNTM2Mzc@._V1_SY1000_CR0,0,689,1000_AL_.jpg"},
            {"The House With A Clock In Its Walls", "Rumah tua menjadi saksi, munculnya kehidupan lagi bagi seorang...", "https://upload.wikimedia.org/wikipedia/en/0/00/The_House_with_a_Clock_in_Its_Walls_%28film%29.png"},
            {"Halloween", "Film Halloween ini dibuat sebagai sekuel dari film Hallowen: Resurrection (2002) dan...", "https://m.media-amazon.com/images/M/MV5BMmMzNjJhYjUtNzFkZi00MWQ4LWJiMDEtYWM0NTAzNGZjMTI3XkEyXkFqcGdeQXVyOTE2OTMwNDk@._V1_.jpg"},
            {"Johnny English Strikes Again", "Menolak muda! Johnny (Rowan Atkinson) tetap “bersahaja”. Melalui mobil...", "https://m.media-amazon.com/images/M/MV5BMjI4MjQ3MjI5MV5BMl5BanBnXkFtZTgwNjczMDE4NTM@._V1_SY1000_CR0,0,674,1000_AL_.jpg"}

    };
    public static ArrayList<Films> getListData(){
        Films films = null;
        ArrayList<Films> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            films = new Films();
            films.setName(data[i][0]);
            films.setDesc(data[i][1]);
            films.setPhoto(data[i][2]);
            list.add(films);
        }
        return list;
    }
}

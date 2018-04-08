package com.woowa.q2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestMain {
    private static String question = "photo.jpg, Warsaw, 2013-09-05 14:08:15\njohn.png, London, 2015-06-20 15:13:22\nmyFriends.png, Warsaw, 2013-09-05 14:07:13\nEiffel.jpg, Paris, 2015-07-23 08:03:02\npisatower.jpg, Paris, 2015-07-22 23:59:59\nBOB.jpg, London, 2015-08-05 00:02:03\nnotredame.png, Paris, 2015-09-01 12:00:00\nme.jpg, Warsaw, 2013-09-06 15:40:22\na.png, Warsaw, 2016-02-13 13:33:50\nb.jpg, Warsaw, 2016-01-02 15:12:22\nc.jpg, Warsaw, 2016-01-02 14:34:30\nd.jpg, Warsaw, 2016-01-02 15:15:01\ne.png, Warsaw, 2016-01-02 09:49:09\nf.png, Warsaw, 2016-01-02 10:55:32\ng.jpg, Warsaw, 2016-02-29 22:13:11";

    public static void main(String args[]) {
        TestMain t = new TestMain();
        System.out.println(t.solution(question));
    }

    public String solution(String S) {
        List<Photo> photos = convertPhoto(S);
        convertName(photos);
        Collections.sort(photos);

        StringBuilder sb = new StringBuilder();
        for (Photo photo: photos) {
            sb.append(photo);
        }
        return sb.toString();
    }

    // Converting
    private List<Photo> convertPhoto(String S) {
        List<Photo> list = new ArrayList<>();
        String[] strPhotos = S.split("\n");
        for (String s: strPhotos) {
            String[] fieldPhotos = s.split(",");
            list.add(new Photo(fieldPhotos[0].trim(), fieldPhotos[1].trim(), getTime(fieldPhotos[2].trim())));
        }
        return list;
    }

    private void convertName(List<Photo> photos) {
        Map<String, Integer> cityCounts = new HashMap<>();

        for (Photo photo: photos) {
            if(cityCounts.containsKey(photo.getCity())) {
                cityCounts.put(photo.getCity(), cityCounts.get(photo.getCity()) + 1);
            } else {
                cityCounts.put(photo.getCity(), 1);
                cityCounts.put(photo.getCity()+"Index", 0);
            }
        }

        for (Photo photo: photos) {
            StringBuilder sb = new StringBuilder();
            sb.append(photo.getCity());
            if(cityCounts.get(photo.getCity()) >= 10) {
                sb.append(String.format("%02d", cityCounts.get(photo.getCity()+"Index") + 1));
            } else {
                sb.append(cityCounts.get(photo.getCity()+"Index") + 1);
            }
            sb.append(".");
            sb.append(photo.getName().split("\\.")[1]);
            cityCounts.put(photo.getCity()+"Index", cityCounts.get(photo.getCity()+"Index") + 1);
            photo.setName(sb.toString());
        }
    }

    // Util
    private long getTime(String strDate) {
        SimpleDateFormat dateFormatGmt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        long ms = 0;
        try {
            Date date = dateFormatGmt.parse(strDate);
            ms = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ms;
    }

    public class Photo implements Comparable<Photo>  {
        private String name;
        private String city;
        private Long time;

        public Photo(String city) {
            this.city = city;
        }

        public Photo(String name, String city, Long time) {
            this.name = name;
            this.city = city;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public String getCity() {
            return city;
        }

        public Long getTime() {
            return time;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name+"\n";
        }

        @Override
        public int compareTo(Photo nextPhoto) {
            return this.getTime().compareTo(nextPhoto.getTime());
        }
    }
}

//photo.jpg, Warsaw, 2013-09-05 14:08:15
//john.png, London, 2015-06-20 15:13:22
//myFriends.png, Warsaw, 2013-09-05 14:07:13
//Eiffel.jpg, Paris, 2015-07-23 08:03:02
//pisatower.jpg, Paris, 2015-07-22 23:59:59
//BOB.jpg, London, 2015-08-05 00:02:03
//notredame.png, Paris, 2015-09-01 12:00:00
//me.jpg, Warsaw, 2013-09-06 15:40:22
//a.png, Warsaw, 2016-02-13 13:33:50
//b.jpg, Warsaw, 2016-01-02 15:12:22
//c.jpg, Warsaw, 2016-01-02 14:34:30
//d.jpg, Warsaw, 2016-01-02 15:15:01
//e.png, Warsaw, 2016-01-02 09:49:09
//f.png, Warsaw, 2016-01-02 10:55:32
//g.jpg, Warsaw, 2016-02-29 22:13:11
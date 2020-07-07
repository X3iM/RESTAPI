package com.android.greena.testapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("name")
        @Expose
        private Name name;
        @SerializedName("location")
        @Expose
        private Location location;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("login")
        @Expose
        private Login login;
        @SerializedName("dob")
        @Expose
        private Dob dob;
        @SerializedName("registered")
        @Expose
        private Registered registered;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("cell")
        @Expose
        private String cell;
        @SerializedName("id")
        @Expose
        private Id id;
        @SerializedName("picture")
        @Expose
        private Picture picture;
        @SerializedName("nat")
        @Expose
        private String nat;

        public String getGender() {return gender;}

        public void setGender(String gender) {this.gender = gender;}

        public Name getName() {return name;}

        public void setName(Name name) {this.name = name;}

        public Location getLocation() {return location;}

        public void setLocation(Location location) {this.location = location;}

        public String getEmail() {return email;}

        public void setEmail(String email) {this.email = email;}

        public Login getLogin() {return login;}

        public void setLogin(Login login) {this.login = login;}

        public Dob getDob() {return dob;}

        public void setDob(Dob dob) {this.dob = dob;}

        public Registered getRegistered() {return registered;}

        public void setRegistered(Registered registered) {this.registered = registered;}

        public String getPhone() {return phone;}

        public void setPhone(String phone) {this.phone = phone;}

        public String getCell() {return cell;}

        public void setCell(String cell) {this.cell = cell;}

        public Id getId() {return id;}

        public void setId(Id id) {this.id = id;}

        public Picture getPicture() {return picture;}

        public void setPicture(Picture picture) {this.picture = picture;}

        public String getNat() {return nat;}

        public void setNat(String nat) {this.nat = nat;}


    public class Id {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("value")
        @Expose
        private String value;

        public String getName() {return name;}

        public void setName(String name) {this.name = name;}

        public String getValue() {return value;}

        public void setValue(String value) {this.value = value;}

    }

    public class Info {

        @SerializedName("seed")
        @Expose
        private String seed;
        @SerializedName("results")
        @Expose
        private int results;
        @SerializedName("page")
        @Expose
        private int page;
        @SerializedName("version")
        @Expose
        private String version;

        public String getSeed() {return seed;}

        public void setSeed(String seed) {this.seed = seed;}

        public int getResults() {return results;}

        public void setResults(int results) {this.results = results;}

        public int getPage() {return page;}

        public void setPage(int page) {this.page = page;}

        public String getVersion() {return version;}

        public void setVersion(String version) {this.version = version;}
    }

    public class Location {

        @SerializedName("street")
        @Expose
        private Street street;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("state")
        @Expose
        private String state;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("postcode")
        @Expose
        private int postcode;
        @SerializedName("coordinates")
        @Expose
        private Coordinates coordinates;
        @SerializedName("timezone")
        @Expose
        private Timezone timezone;

        public Street getStreet() {
            return street;
        }

        public void setStreet(Street street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPostcode() {
            return postcode;
        }

        public void setPostcode(int postcode) {
            this.postcode = postcode;
        }

        public Coordinates getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
        }

        public Timezone getTimezone() {
            return timezone;
        }

        public void setTimezone(Timezone timezone) {
            this.timezone = timezone;
        }

    }

    public class Login {

        @SerializedName("uuid")
        @Expose
        private String uuid;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("salt")
        @Expose
        private String salt;
        @SerializedName("md5")
        @Expose
        private String md5;
        @SerializedName("sha1")
        @Expose
        private String sha1;
        @SerializedName("sha256")
        @Expose
        private String sha256;

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public String getMd5() {
            return md5;
        }

        public void setMd5(String md5) {
            this.md5 = md5;
        }

        public String getSha1() {
            return sha1;
        }

        public void setSha1(String sha1) {
            this.sha1 = sha1;
        }

        public String getSha256() {
            return sha256;
        }

        public void setSha256(String sha256) {
            this.sha256 = sha256;
        }

    }

    public class Name {

        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("first")
        @Expose
        private String first;
        @SerializedName("last")
        @Expose
        private String last;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

    }

    public class Picture {

        @SerializedName("large")
        @Expose
        private String large;
        @SerializedName("medium")
        @Expose
        private String medium;
        @SerializedName("thumbnail")
        @Expose
        private String thumbnail;

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

    }

    public class Registered {

        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("age")
        @Expose
        private int age;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }

    public class Street {

        @SerializedName("number")
        @Expose
        private int number;
        @SerializedName("name")
        @Expose
        private String name;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class Timezone {

        @SerializedName("offset")
        @Expose
        private String offset;
        @SerializedName("description")
        @Expose
        private String description;

        public String getOffset() {
            return offset;
        }

        public void setOffset(String offset) {
            this.offset = offset;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

    public class Coordinates {

        @SerializedName("latitude")
        @Expose
        private String latitude;
        @SerializedName("longitude")
        @Expose
        private String longitude;

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

    }

    public class Dob {

        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("age")
        @Expose
        private int age;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }
}
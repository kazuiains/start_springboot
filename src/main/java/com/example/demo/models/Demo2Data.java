package com.example.demo.models;

import com.example.demo.models.pojo.DemoPojo;

import java.util.ArrayList;
import java.util.List;

public class Demo2Data {

    //    sama kaya android kan ya. List<classOrTypeData> tetap List<classOrTypeData>
    private List<DemoPojo> data;

    private static Demo2Data instance = null;

    public static Demo2Data getInstance() {
        if (instance == null) {
            instance = new Demo2Data();
        }
        return instance;
    }


    public Demo2Data() {
        data = new ArrayList<>();
        data.add(new DemoPojo(1, "Go up, up and away with your Google Assistant",
                "With holiday travel coming up, and 2018 just around the corner, " +
                        "you may be already thinking about getaways for next year. Consider " +
                        "the Google Assistant your new travel buddy, ready at the drop of a hat—or a passport"));
        data.add(new DemoPojo(2, "Get local help with your Google Assistant",
                "No matter what questions you’re asking—whether about local traffic or " +
                        "a local business—your Google Assistant should be able to help. And starting " +
                        "today, it’s getting better at helping you, if you’re looking for nearby services " +
                        "like an electrician, plumber, house cleaner and more"));
        data.add(new DemoPojo(3, "The new maker toolkit: IoT, AI and Google Cloud Platform",
                "Voice interaction is everywhere these days—via phones, TVs, laptops and smart home devices " +
                        "that use technology like the Google Assistant. And with the availability of maker-friendly " +
                        "offerings like Google AIY’s Voice Kit, the maker community has been getting in on the action " +
                        "and adding voice to their Internet of Things (IoT) projects."));
        data.add(new DemoPojo(4, "Learn more about the world around you with Google Lens and the Assistant",
                "Looking at a landmark and not sure what it is? Interested in learning more about a movie as " +
                        "you stroll by the poster? With Google Lens and your Google Assistant, you now have a helpful " +
                        "sidekick to tell you more about what’s around you, right on your Pixel."));
        data.add(new DemoPojo(5, "7 ways the Assistant can help you get ready for Turkey Day",
                "Thanksgiving is just a few days away and, as always, your Google Assistant is ready to help. " +
                        "So while the turkey cooks and the family gathers, here are some questions to ask your Assistant."));
    }

    public List<DemoPojo> fetchAllData() {
        return data;
    }

    public DemoPojo getData(int id) {
        for (DemoPojo dt : data) {
            if (dt.getId() == id) {
                return dt;
            }
        }
        return null;
    }

    public List<DemoPojo> searchData(String searchKey) {
        List<DemoPojo> searchItem = new ArrayList<>();
        for (DemoPojo dt : data) {
            if (
                    dt.getJudul().toLowerCase().contains(searchKey.toLowerCase())
                            || dt.getDeskripsi().toLowerCase().contains(searchKey.toLowerCase())
            ) {
                searchItem.add(dt);
            }
        }
        return searchItem;
    }

    public DemoPojo addData(int id, String judul, String deskripsi) {
        DemoPojo newData = new DemoPojo(id, judul, deskripsi);
        data.add(newData);
        return newData;
    }

    public DemoPojo editData(int id, String judul, String deksripsi) {
        for (DemoPojo dt : data) {
            if (dt.getId() == id) {
                int indexData = data.indexOf(dt);
                DemoPojo dataForEdit = data.get(indexData);
                dataForEdit.setJudul(judul);
                dataForEdit.setDeskripsi(deksripsi);
                return dt;
            }
        }
        return null;
    }

    public boolean deleteData(int id) {
        int indexData = -1;
        for (DemoPojo dt : data) {
            if (dt.getId() == id) {
                indexData = data.indexOf(dt);
                continue;
            }
        }
        if (indexData > -1) {
            data.remove(indexData);
        }
        return true;
    }
}

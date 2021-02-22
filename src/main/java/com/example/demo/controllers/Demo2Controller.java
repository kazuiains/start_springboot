package com.example.demo.controllers;

import com.example.demo.models.Demo2Data;
import com.example.demo.models.pojo.DemoPojo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class Demo2Controller {
    Demo2Data datas = Demo2Data.getInstance();

    @GetMapping("/demo") //atau bisa seperti ini @RequestMapping(value="/demo", method=RequestMethod.GET)
    public List<DemoPojo> index() {
        return datas.fetchAllData();
    }

//    misalnya ada url = "http://adiyusuf.com/detail?uid=100&idprodi=100
//    maka kita dapat menggunakan (@RequestParam String param1, @RequestParam String param2) atau bisa pakai MAP

//    @GetMapping("/detail")
//    public returnType methodName(@RequestParam String param1, @RequestParam String param2)
//    {
//    }

//    path variabel untuk mengambil path
//    sedangkan requestparam untuk mengambil parameter
//    request body untuk mengambil data di body. berupa json

    @GetMapping("/demo/{id}") //ini contoh dari pengam bilang url seperti "http://adiyusuf.com/demo/122
    public DemoPojo detail(@PathVariable String id) {
        int dataId = Integer.parseInt(id);
        return datas.getData(dataId);
    }

    @PostMapping("/demo/search")
    public List<DemoPojo> search(@RequestBody Map<String, String> body) {
        String searchItem = body.get("text");
        return datas.searchData(searchItem);
    }

    @PostMapping("/demo")
    public DemoPojo add(@RequestBody Map<String, String> body) {
        int id = Integer.parseInt(body.get("id"));
        String judul = body.get("judul");
        String deskrip = body.get("deskripsi");
        return datas.addData(id, judul, deskrip);
    }

    @PutMapping("/demo/{id}")
    public DemoPojo edit(@PathVariable String id, @RequestBody Map<String, String> body) {
        int demoId = Integer.parseInt(id);
        String judul = body.get("judul");
        String deskrip = body.get("deskripsi");
        return datas.editData(demoId, judul, deskrip);
    }

    @DeleteMapping("/demo/{id}")
    public boolean delete(@PathVariable String id) {
        int demoId = Integer.parseInt(id);
        return datas.deleteData(demoId);
    }


}

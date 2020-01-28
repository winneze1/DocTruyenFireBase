package com.example.doctruyenfirebase.Interface;

import com.example.doctruyenfirebase.Model.Comic;

import java.util.List;

public interface IComicLoadDone {
    void onComicLoadDoneListener(List<Comic> comicList);
}

package com.example.gestionefile5d;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Gestore
{
    private String nomeFile;

    public Gestore(String nomeFile)
    {
        this.nomeFile = nomeFile;
    }

    public String leggiFile(String nomeFile, Context c)
    {
        try
        {
            BufferedReader fileIn = new BufferedReader(new InputStreamReader(c.openFileInput(nomeFile)));
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return "";
    }
}

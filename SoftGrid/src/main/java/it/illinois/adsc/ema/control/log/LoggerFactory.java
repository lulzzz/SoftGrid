/* Copyright (C) 2016 Advanced Digital Science Centre

        * This file is part of Soft-Grid.
        * For more information visit https://www.illinois.adsc.com.sg/cybersage/
        *
        * Soft-Grid is free software: you can redistribute it and/or modify
        * it under the terms of the GNU General Public License as published by
        * the Free Software Foundation, either version 3 of the License, or
        * (at your option) any later version.
        *
        * Soft-Grid is distributed in the hope that it will be useful,
        * but WITHOUT ANY WARRANTY; without even the implied warranty of
        * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        * GNU General Public License for more details.
        *
        * You should have received a copy of the GNU General Public License
        * along with Soft-Grid.  If not, see <http://www.gnu.org/licenses/>.

        * @author Prageeth Mahendra Gunathilaka
*/
package it.illinois.adsc.ema.control.log;

import org.slf4j.Logger;
import org.slf4j.helpers.SubstituteLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.LogManager;

/**
 * Created by prageethmahendra on 29/2/2016.
 */
public class LoggerFactory {
    private static HashMap<String, Logger> loggerHashMap = new HashMap<String, Logger>();

    public LoggerFactory() {
        loggerHashMap.put("System.in", new SubstituteLogger("System.in"));
    }

    private Logger logger = new SubstituteLogger("System.in");

    public static Logger getLogger(String name){
        if(name != null && !name.isEmpty())
        {
           return loggerHashMap.get(name);
        }
        return null;
    }

    public static void createLogger(String name)
    {
        if(name != null && !name.isEmpty())
        {
            if(loggerHashMap.get(name) == null){
                loggerHashMap.put(name, new SubstituteLogger(name));
            }
        }
    }

    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("C:\\martPower\\smartpower\\SmartPower\\lib\\logging.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        java.util.logging.Logger.getLogger("abc").info("abc");
        File file = new File(LogManager.getLogManager().getProperty("java.util.logging.FileHandler.pattern"));
        System.out.println(file.getAbsolutePath());
//        LoggerFactory loggerFactory = new LoggerFactory();
//        loggerFactory.getLogger("System.in").info("Mal mal");
//        System.out.println(loggerFactory.getLogger("System.in").getClass().getClassLoader().getResource("logging.properties"));
    }
}

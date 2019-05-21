package com.example.filesystem.components;


import com.example.filesystem.emuns.FileExtension;
import com.example.filesystem.models.File;
import com.example.filesystem.models.Folder;
import com.example.filesystem.models.User;
import com.example.filesystem.repositories.FileRepository;
import com.example.filesystem.repositories.FolderRepository;
import com.example.filesystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User jenn = new User("Jenn");
        userRepository.save(jenn);

        User bob = new User("Bob");
        userRepository.save(bob);

        Folder jennWork = new Folder("work", jenn);
        folderRepository.save(jennWork);

        Folder bobStuff = new Folder("stuff", bob);
        folderRepository.save(bobStuff);

        File jennHomework = new File("homework", FileExtension.JAVA, 1024, jennWork);
        fileRepository.save(jennHomework);

        File jennCV = new File("CV", FileExtension.TXT, 1024, jennWork);
        fileRepository.save(jennCV);

        File bobPresentation = new File("presentation", FileExtension.PPT, 512, bobStuff);
        fileRepository.save(bobPresentation);
    }


}

package com.example.LearnABirdAPI.service.impl;

import com.example.LearnABirdAPI.model.Bird;
import com.example.LearnABirdAPI.repository.BirdRepository;
import com.example.LearnABirdAPI.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class BirdServiceImpl implements BirdService {

    @Autowired
    private BirdRepository birdRepository;

    @Override
    public Bird addBird(Bird bird) {

        ClassPathResource backImgFile = new ClassPathResource("image/crane.jpg");
        ClassPathResource soundFile = new ClassPathResource("sound/crane.wav");
        byte[] arrayPic = new byte[0];
        byte[] arraySound = new byte[0];
        try {
            arrayPic = new byte[(int) backImgFile.contentLength()];
            arraySound = new byte[(int) soundFile.contentLength()];
            backImgFile.getInputStream().read(arrayPic);
            soundFile.getInputStream().read(arraySound);
            bird.setPhoto(arrayPic);
            bird.setSound(arraySound);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return birdRepository.save(bird);
    }

    @Override
    public List<Bird> getBirds() {
        return birdRepository.findAll();
    }

    @Override
    public void initData() {

        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Bird bird3 = new Bird();
        Bird bird4 = new Bird();
        Bird bird5 = new Bird();

        bird1.setName("Parrot");
        bird2.setName("Crow");
        bird3.setName("Pigeon");
        bird4.setName("Eagle");
        bird5.setName("Crane");

        bird1.setInfo("Parrots are members of the order Psittaciformes, which includes more than 350 bird species, including parakeets, macaws, cockatiels and cockatoos, according to the Integrated Taxonomic Information System (ITIS). Though there are many types of parrots, all parrot species have a few traits in common. For example, to be classified as a parrot, the bird must have a curved beak, and its feet must be zygodactyl, which means there are four toes on each foot with two toes that point forward and two that point backward.");
        bird2.setInfo("Crows are black birds known for their intelligence and adaptability, and for their loud, harsh \"caw.\" They also have a reputation for damaging crops; however, their impact may be less than previously thought. \n" +
                "\n" +
                "The genus Corvus comprises crows, ravens and rooks. These birds are all part of the Corvidae family, which includes jays, magpies and nutcrackers.");
        bird3.setInfo("Pigeon, any of several hundred species of birds constituting the family Columbidae (order Columbiformes). Smaller forms are usually called doves, larger forms pigeons. An exception is the white domestic pigeon, the symbol known as the “dove of peace.” \n"+
                "Pigeons occur worldwide except in the coldest regions and the most remote islands. About 250 species are known; two-thirds of them occur in tropical Southeast Asia, Australia, and the islands of the western Pacific, but the family also has many members in Africa and South America and a few in temperate Eurasia and North America. All members of the family suck liquids, rather than sip and swallow as do other birds, and all pigeon parents feed their young “pigeon’s milk,” the sloughed-off lining of the crop, the production of which is stimulated by the hormone prolactin. The nestling obtains this “milk” by poking its bill down the parent’s throat.");
        bird4.setInfo("Eagle, any of many large, heavy-beaked, big-footed birds of prey belonging to the family Accipitridae (order Falconiformes). In general, an eagle is any bird of prey more powerful than a buteo. An eagle may resemble a vulture in build and flight characteristics but has a fully feathered (often crested) head and strong feet equipped with great curved talons. A further difference is in foraging habits: eagles subsist mainly on live prey. They are too ponderous for effective aerial pursuit but try to surprise and overwhelm their prey on the ground. Like owls, many decapitate their kills. Because of their strength, eagles have been a symbol of war and imperial power since Babylonian times. Their likeness is found on Greek and Roman ruins, coins, and medals.");
        bird5.setInfo("Crane, any of 15 species of tall wading birds of the family Gruidae (order Gruiformes). Superficially, cranes resemble herons but usually are larger and have a partly naked head, a heavier bill, more compact plumage, and an elevated hind toe. In flight the long neck is stretched out in front, the stiltlike legs trailing out behind. \n"+
                "Cranes form an ancient group, the earliest fossils having been recovered from Eocene deposits in North America. Living forms are found worldwide except in South America, but populations of many are endangered by hunting and habitat destruction.\n" +
                "\n" +
                "These graceful terrestrial birds stalk about in marshes and on plains, eating small animals of all sorts as well as grain and grass shoots. Two olive-gray eggs spotted with brown are laid in a nest of grasses and weed stalks on drier ground in marsh or field. The same nest may be used year after year. The brownish, downy young can run about shortly after hatching. The trachea (windpipe) is simple in the chick but lengthens with age, coiling upon itself like a French horn. It lies buried in the hollow keel of the breastbone and reaches a length of 1.5 metres (5 feet) in the adult whooping crane (Grus americana).............................................................");

        ClassPathResource bird1img = new ClassPathResource("image/parrot.jpg");
        ClassPathResource bird2img = new ClassPathResource("image/crow.jpg");
        ClassPathResource bird3img = new ClassPathResource("image/pigeon.jpg");
        ClassPathResource bird4img = new ClassPathResource("image/eagle.jpg");
        ClassPathResource bird5img = new ClassPathResource("image/crane.jpg");

        ClassPathResource bird1sound = new ClassPathResource("sound/parrot.mp3");
        ClassPathResource bird2sound = new ClassPathResource("sound/crow.wav");
        ClassPathResource bird3sound = new ClassPathResource("sound/pigeon.wav");
        ClassPathResource bird4sound = new ClassPathResource("sound/eagle.wav");
        ClassPathResource bird5sound = new ClassPathResource("sound/crane.wav");

        byte[] arrayPic = new byte[0];
        byte[] arraySound = new byte[0];

        try {
            arrayPic = new byte[(int) bird1img.contentLength()];
            arraySound = new byte[(int) bird1sound.contentLength()];
            bird1img.getInputStream().read(arrayPic);
            bird1sound.getInputStream().read(arraySound);
            bird1.setPhoto(arrayPic);
            bird1.setSound(arraySound);
        } catch (IOException e) {
            e.printStackTrace();
        }
        birdRepository.save(bird1);

        try {
            arrayPic = new byte[(int) bird2img.contentLength()];
            arraySound = new byte[(int) bird1sound.contentLength()];
            bird2img.getInputStream().read(arrayPic);
            bird2sound.getInputStream().read(arraySound);
            bird2.setPhoto(arrayPic);
            bird2.setSound(arraySound);
        } catch (IOException e) {
            e.printStackTrace();
        }
        birdRepository.save(bird2);

        try {
            arrayPic = new byte[(int) bird3img.contentLength()];
            arraySound = new byte[(int) bird3sound.contentLength()];
            bird3img.getInputStream().read(arrayPic);
            bird3sound.getInputStream().read(arraySound);
            bird3.setPhoto(arrayPic);
            bird3.setSound(arraySound);
        } catch (IOException e) {
            e.printStackTrace();
        }
        birdRepository.save(bird3);

        try {
            arrayPic = new byte[(int) bird4img.contentLength()];
            arraySound = new byte[(int) bird4sound.contentLength()];
            bird4img.getInputStream().read(arrayPic);
            bird4sound.getInputStream().read(arraySound);
            bird4.setPhoto(arrayPic);
            bird4.setSound(arraySound);
        } catch (IOException e) {
            e.printStackTrace();
        }
        birdRepository.save(bird4);

        try {
            arrayPic = new byte[(int) bird5img.contentLength()];
            arraySound = new byte[(int) bird5sound.contentLength()];
            bird5img.getInputStream().read(arrayPic);
            bird5sound.getInputStream().read(arraySound);
            bird5.setPhoto(arrayPic);
            bird5.setSound(arraySound);
        } catch (IOException e) {
            e.printStackTrace();
        }
        birdRepository.save(bird5);
    }
}

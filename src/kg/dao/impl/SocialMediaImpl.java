package kg.dao.impl;

import kg.dao.SocialMediaDao;
import kg.db.Database;
import kg.models.Person;
import kg.models.SocialMedia;
import kg.service.SocialMediaService;

import java.util.List;

public class SocialMediaImpl implements SocialMediaDao {
    @Override
    public void assignSocialMediaToPerson() {

    }

    @Override
    public String saveSocialMedia(Long personId, SocialMedia socialMedia) {
        for (Person person : Database.persons) {
            if (person.getId().equals(personId)){
                person.addSocialMedia(socialMedia);
            }
        }
        return "Success";
    }

    @Override
    public SocialMediaService getSocialMediaById(Long id) {
//        for (Person person : Database.persons) {
//            for (SocialMedia socialMedia : person.getSocialMedias()) {
//                if (socialMedia.getId().equals(id)){
//                    System.out.println(socialMedia);
//                }
//            }
//        }
            for (SocialMedia socialMedia : Database.socialMedias) {
                if (socialMedia.getId().equals(id)){
                    System.out.println(socialMedia);
                }
            }
        return null;
    }

    @Override
    public List<SocialMediaService> getAllSocialMediaByPersonId() {
        return null;
    }

    @Override
    public void deleteAllSocialMediaByPersonId() {

    }

    @Override
    public void deleteSocialMediaById() {

    }
}

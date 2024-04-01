package kg.dao;

import kg.models.SocialMedia;
import kg.service.SocialMediaService;

import java.util.List;

public interface SocialMediaDao {



    void assignSocialMediaToPerson();
    String saveSocialMedia(Long personId, SocialMedia socialMedia);
    SocialMediaService getSocialMediaById(Long id);
    List<SocialMediaService> getAllSocialMediaByPersonId();
    void deleteAllSocialMediaByPersonId();
    void deleteSocialMediaById();
}

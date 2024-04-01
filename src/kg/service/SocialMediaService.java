package kg.service;

import kg.models.SocialMedia;

import java.util.List;

public interface SocialMediaService {




    void assignSocialMediaToPerson(Long personId, SocialMedia socialMedia);
    String saveSocialMedia(Long personId,SocialMedia socialMedia);
    SocialMediaService getSocialMediaById(Long id);
    List<SocialMediaService> getAllSocialMediaByPersonId();
    void deleteAllSocialMediaByPersonId();
    void deleteSocialMediaById();
}

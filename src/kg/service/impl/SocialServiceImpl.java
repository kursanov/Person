package kg.service.impl;

import kg.dao.SocialMediaDao;
import kg.models.SocialMedia;
import kg.service.SocialMediaService;

import java.util.List;

public class SocialServiceImpl implements SocialMediaService {

    private final SocialMediaDao socialMediaDao;

    public SocialServiceImpl(SocialMediaDao socialMediaDao) {
        this.socialMediaDao = socialMediaDao;
    }



    @Override
    public void assignSocialMediaToPerson(Long personId, SocialMedia socialMedia) {

    }

    @Override
    public String saveSocialMedia(Long personId,SocialMedia socialMedia) {
        return socialMediaDao.saveSocialMedia(personId, socialMedia);
    }

    @Override
    public SocialMediaService getSocialMediaById(Long id) {
        return socialMediaDao.getSocialMediaById(id);
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

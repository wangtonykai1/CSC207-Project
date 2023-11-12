package Entity.PetProfiles;

import java.util.List;

public abstract class PetProfileBuilder<T extends PetProfileBuilder<T,P>, P extends PetProfile>{
    String name;
    int age;
    char sex;
    String specie;
    char size;
    String petPhotoLink;
    List<String> morePhotos;
    final String petOwnerName;
    String LikeDescr;
    String TemperDescr;
    public PetProfileBuilder(String petOwnerName){
        this.petOwnerName = petOwnerName;
    }

    public abstract P build();
    public T self(){
        return (T) this;
    }



    public T withName(String name){
        this.name = name;
        return self();
    }
    public T withSize(char size){
        /*valid size char letter */
        this.size = size;
        return self();
    }
    public T withAge(int age){
        this.age = age;
        return self();
    }
    public T withSex(char sex){
        /*valid sex char only*/
        this.sex = sex;
        return self();
    }
    public T withPetPhoto(String path){
        this.petPhotoLink = path;
        return self();
    }

    public T withMorePhotos(List<String> morePhotoPaths){
        this.morePhotos = morePhotoPaths;
        return self();
    }
    public T withTemperDescr(String descr){
        this.TemperDescr = descr;
        return self();
    }
    public T withLikedDescr(String descr){
        this.LikeDescr = descr;
        return self();
    }

}
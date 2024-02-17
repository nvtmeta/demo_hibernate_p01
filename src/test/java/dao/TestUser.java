package dao;

import org.junit.jupiter.api.Test;

@Test
void saveUser_shouldSaveWithDefaultFieldValues(){
        User user=new User();
        user=userRepository.save(user);

        assertEquals(user.getName(),"John Snow");
        assertEquals(user.getAge(),25);
        assertFalse(user.getLocked());
        }
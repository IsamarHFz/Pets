package com.example.pets.ui

import androidx.lifecycle.ViewModel

class FactsViewModel: ViewModel() {
    fun generateRandomFact(selectedAnimal:String) : String {
        return if (selectedAnimal == "Dog"){
            getDogFacts().random()
        } else {
            getCatFacts().random()
        }
    }
    fun getDogFacts(): List<String> {
        val dogFacts = listOf(
            "Dogs are loyal companions that demonstrate unconditional devotion to their owners.",

            "Many canine breeds exhibit great intelligence and learning capabilities.",

            "The diversity in sizes and shapes of dog breeds is astonishing, ranging from small Chihuahuas to large Danes.",

            "Dogs are renowned for their keen sense of smell, making them valuable in roles such as search and rescue dogs.",

            "Most dogs enjoy physical activity and require regular exercise to stay healthy and happy.",

            "Some dogs have incredibly soft fur, while others have rougher and more protective coats.",

            "Dogs can be trained to perform a variety of tasks, from simple tricks to specialized jobs like guide or therapy dogs.",

            "Canine communication includes barking, growling, and a variety of facial expressions that can indicate their emotions.",

            "The lifespan of dogs varies by breed, but in general, many dogs can live between 10 and 15 years or more.",

            "Dogs are known for their loyalty and the ability to form strong emotional bonds with their human families.",
        )
        return dogFacts
    }

    fun getCatFacts(): List<String> {
        val catFacts = listOf(
            "Cats are independent companions that value their personal space.",

            "Many feline breeds display a graceful and elegant demeanor.",

            "The diversity in sizes and coat patterns of cat breeds is extensive, from small and sleek Siamese to large and fluffy Maine Coons.",

            "Cats are known for their keen senses, particularly their acute night vision and sensitive whiskers.",

            "Most cats enjoy periods of play and exercise, balancing them with long hours of rest.",

            "Some cats have silky fur, while others boast dense and luxurious coats.",

            "Cats can be trained to perform tricks and respond to commands, although they often retain their independent nature.",

            "Feline communication involves a range of vocalizations, purring, and subtle body language.",

            "The lifespan of cats varies by breed, but many can live into their late teens and beyond.",

            "Cats form strong bonds with their human companions, showing affection in their own unique ways.",
        )
        return catFacts
    }
}
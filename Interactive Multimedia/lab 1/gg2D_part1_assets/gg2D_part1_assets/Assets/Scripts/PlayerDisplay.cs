using UnityEngine;
using System.Collections;

using UnityEngine.UI;

public class PlayerDisplay : MonoBehaviour {
	
	public Text scoreText;
	public Text livesText;

	
	public void UpdateScoreText(int newScore){
		string scoreMessage = "Score: " + newScore;
		scoreText.text = scoreMessage;
	}

	public void UpdateLivesText(int newLives){
		string livesMessage = "newLives: " + newLives;
		livesText.text = livesMessage;
	}
}

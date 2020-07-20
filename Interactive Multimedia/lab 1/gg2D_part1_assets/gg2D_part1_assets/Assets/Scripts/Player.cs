using UnityEngine;
using System.Collections;

using UnityEngine.UI;

public class Player : MonoBehaviour {
	//declare variable
	private PlayerDisplay playerDisplay;
	private int lives = 3;
	private int score = 0;
	private float deathY = -15;

	void Start()
	{
		playerDisplay = GetComponent<PlayerDisplay>();
		playerDisplay.UpdateScoreText(score);
		playerDisplay.UpdateLivesText(lives);
	}

	// Update is called once per frame
	void Update () {

		float y = transform.position.y;
		if (y < deathY) {
			LoseLife();
		}//end if for respawn
	}//end update

	//creates a start position for player
	private void MoveToStartPosition(){
		Vector3 startPosition = new Vector3 (0,5,0);
		transform.position = startPosition;
	}//end start position

	//method to take a life from a player
	private void LoseLife(){
		lives--;
		playerDisplay.UpdateLivesText (lives);
		MoveToStartPosition();
	}

	//used to trigger an action upon collision
	void OnTriggerEnter2D(Collider2D hit){
		//conditions if it hits an object with tag food
		if (hit.CompareTag ("Food")) {
			//iterate score
			score++;
			//update screen
			playerDisplay.UpdateScoreText(score);
			//remove object
			Destroy (hit.gameObject);
			//plays sound
			audio.Play ();
		}//end if

		if(hit.CompareTag("Spikes")){
			LoseLife();
		}
	}//end collider trigger
}//end class

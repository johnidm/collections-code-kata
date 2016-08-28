from flask import Flask, request
import requests

app = Flask(__name__)

ACCESS_TOKEN = "EAAEHUh8nTJsBAB5ZC90CZByyzgJktcuXRzGrCqpicpyiZB12KGsyJIhNPwhCkHIow8JS2KrElqzdGHOylSpJrfBAgfUvbHoaxqTbiLYmwWEELO1gdf0LWupZB3z8Ra9bzN7DnonO2tFcNWA2K2uLpd7TWVTOANpIX5DBkWLKygZDZD"
VERIFY_TOKEN = ""


def reply(user_id, msg):
    data = {
        "recipient": {"id": user_id},
        "message": {"text": msg}
    }
    resp = requests.post(
        "https://graph.facebook.com/v2.6/me/messages?access_token=" + ACCESS_TOKEN, json=data)
    print(resp.content)


@app.route('/', methods=['GET'])
def handle_verification():
    if request.args['hub.verify_token'] == VERIFY_TOKEN:
        return request.args['hub.challenge']
    else:
        return "Invalid verification token"


@app.route('/', methods=['POST'])
def handle_incoming_messages():
    data = request.json
    import pdb; pdb.set_trace()
    sender = data['entry'][0]['messaging'][0]['sender']['id']
    message = data['entry'][0]['messaging'][0]['message']['text']
    reply(sender, message)

    return "ok"


if __name__ == '__main__':
    app.run(debug=True)

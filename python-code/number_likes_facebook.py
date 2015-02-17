# usar python 2

import urllib2
import json

def getPageData(page_id):
    api_endpoint = "https://graph.facebook.com"
    fb_graph_url = api_endpoint+"/"+page_id
    
    api_request = urllib2.Request(fb_graph_url)
    api_response = urllib2.urlopen(api_request)
    try:
        return json.loads(api_response.read())
    except (ValueError, KeyError, TypeError):
        return "JSON error"

    

page_id = "johnidm" # username or id

data = getPageData(page_id)
print(data)
#print ("Page Name:"+ data['name'])
#print ("Likes:"+ str(data['likes']))
#print ("Website:"+ data['link'])
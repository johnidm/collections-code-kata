require 'test_helper'

class RestaurantesControllerTest < ActionController::TestCase
  test "should get index" do
    get :index
    assert_response :success
  end

end
